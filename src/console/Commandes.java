package console;

import bean.CommandResponse;
import bean.Player;

public class Commandes {

	public static CommandResponse sendCommand(String command, Player player) {
		String receivedCommand = command.toLowerCase();
		String idNoeud=null;
		if(receivedCommand.contains("goto")) {
			idNoeud=receivedCommand.substring(5, receivedCommand.length());
			receivedCommand="goto";
		}
		CommandResponse response=null;
		switch (receivedCommand) {
		case "!help":
			response = new CommandResponse("Commandes disponibles :\n - 'goto [numero]' : se rendre a la position voulue.\n - 'crier' : permet de crier.");
			break;
		case "crier":
			response = new CommandResponse("Vous criez mais rien ne se passe");
			break;
		case "goto":
			boolean accuse = player.changeNoeud(idNoeud);
			if(accuse) {
				response = new CommandResponse(player.getNoeudActuel().getMessage());
			} else {
				response = new CommandResponse("Destination invalide !");
			}
			break;
		default:
			response = new CommandResponse("Il y a un soucis dans tes ordres... '!help' pour la liste des commandes");
			break;
		}
		return response;
	}
}
