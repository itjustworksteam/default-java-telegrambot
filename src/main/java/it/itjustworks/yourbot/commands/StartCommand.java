package it.itjustworks.yourbot.commands;

public class StartCommand implements Command {

	@Override
	public String execute(String message) {
		String output = "";
		output += "start command output";
		return output;
	}

}
