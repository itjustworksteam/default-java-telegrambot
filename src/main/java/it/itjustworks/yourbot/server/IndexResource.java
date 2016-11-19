package it.itjustworks.yourbot.server;

import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class IndexResource extends ServerResource{

	@Get
	public StringRepresentation hello() {
		return new StringRepresentation("It Just Works!!!");
	}
}
