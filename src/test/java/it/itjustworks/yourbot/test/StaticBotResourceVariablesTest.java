package it.itjustworks.yourbot.test;

import static org.junit.Assert.*;

import org.junit.*;

import it.itjustworks.yourbot.server.BotResource;

public class StaticBotResourceVariablesTest {
	
	@Test
	public void testWrongTelegramToken() {
		assertEquals(wrongTelegramTokenOutput(), BotResource.WRONG_TELEGRAM_TOKEN);
	}
	
	@Test
	public void testParseError(){
		assertEquals(parseErrorOutput(), BotResource.PARSE_ERROR);
	}
	
	@Test
	public void testGetResponse() {
		assertEquals(getResponseOutput(), BotResource.GET_RESPONSE);
	}
	
	@Test
	public void testMaintainance() {
		assertNotNull(BotResource.UPGRADE);
	}
	
	private String getResponseOutput() {
		String output = "";
		output += "See the chat on Telegram for more details!!!";
		return output;
	}
	
	private String parseErrorOutput() {
		String output = "";
		output += "Impossible to parse the Telegram update!!!";
		return output;
	}
	
	private String wrongTelegramTokenOutput() {
		String output = "";
		output += "Wrong token from Telegram servers!!!";
		return output;
	}
	
}
