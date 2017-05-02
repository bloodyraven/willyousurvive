package graph;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GameGraphe extends Graphe {

	public GameGraphe() {
		// initialisation des noeuds, arcs à partir des fichiers
		try {
			InputStream flux = new FileInputStream("resources/graphe/noeudsGraphe");
			InputStreamReader lecture = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);
			String ligne;
			while ((ligne = buff.readLine()) != null) {
				String[] split = ligne.split("/");
				new Noeud(split[0], split[1], this);
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error while reading noeudsGraphe.txt. " +e);
		}
		try {
			InputStream flux = new FileInputStream("resources/graphe/arcsGraphe");
			InputStreamReader lecture = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);
			String ligne;
			while ((ligne = buff.readLine()) != null) {
				String[] split = ligne.split("/");
				new Arc(split[0], split[1], this);
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error while reading arcsGraphe.txt. "+e);
		}
	}
}
