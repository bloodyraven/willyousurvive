package bean;

import graph.GameGraphe;
import graph.Noeud;


public class Player {

	private String name;
	private Noeud noeudActuel;
	
	public Player(String name) {
		this.name=name;
		GameGraphe gg = new GameGraphe();
		noeudActuel = (Noeud) gg.getNoeuds()[0];
		noeudActuel.setVisited(true);
	}
	
	public boolean changeNoeud(String idNoeud) {
		Object[] noeuds = noeudActuel.getChildren(noeudActuel);
		for (Object noeud : noeuds) {
			if((((Noeud) noeud).getNom()).equals(idNoeud)) {
				noeudActuel = (Noeud)noeud;
				noeudActuel.setVisited(true);
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Noeud getNoeudActuel() {
		return noeudActuel;
	}

	public void setNoeudActuel(Noeud noeudActuel) {
		this.noeudActuel = noeudActuel;
	}
}
