package console;

import bean.CommandResponse;

public class Commandes {

	public static CommandResponse sendCommand(String command) {
		String receivedCommand = command.toLowerCase();
		CommandResponse response=null;
		switch (receivedCommand) {
		case "crier":
			response = new CommandResponse("Vous criez mais rien ne se passe");
			break;

		default:
			break;
		}
		return response;
	}
}
