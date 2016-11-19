package it.itjustworks.yourbot.server;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Redirector;
import org.restlet.routing.Router;

public class BotApplication extends Application {

	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());
		
		router.attach("/", IndexResource.class);
		getLogger().info("Started " + IndexResource.class.toString() + " @ /");
		
		// redirect example
		String redirect = "https://core.telegram.org/bots";
		Redirector redirector =  new Redirector(getContext(), redirect, Redirector.MODE_CLIENT_PERMANENT);
		router.attach("/redirect", redirector);
		getLogger().info("Started " + Redirector.class.toString() + " @ /redirect");
		
		// bot response
		router.attach("/bot/{token}", BotResource.class);
		getLogger().info("Started " + BotResource.class.toString() + " @ /bot/{token}");
						
		return router;
	}
	
}
