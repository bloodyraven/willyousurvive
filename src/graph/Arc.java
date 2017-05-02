package graph;

import java.util.ListIterator;

public class Arc {
	Noeud noeudOrigine;
	Noeud noeudExtremite;

	public Arc(String nomNoeudOrigine, String nomNoeudExtremite, Graphe graphe) {

		// recherche noeudorigine par son nom
		ListIterator<Noeud> liNoeuds = graphe.listeNoeuds.listIterator();
		Boolean trouveOrigine = false;
		while (liNoeuds.hasNext() && !trouveOrigine) {
			Noeud noeudCourant = liNoeuds.next();
			if (nomNoeudOrigine.equals(noeudCourant.getNom())) {
				noeudOrigine = noeudCourant;
				trouveOrigine = true;
			}
		}
		// recherche noeudextremite par son nom
		liNoeuds = graphe.listeNoeuds.listIterator();
		Boolean trouveExtremite = false;
		while (liNoeuds.hasNext() && !trouveExtremite) {
			Noeud noeudCourant = liNoeuds.next();
			if (nomNoeudExtremite.equals(noeudCourant.getNom())) {
				noeudExtremite = noeudCourant;
				trouveExtremite = true;
			}
		}
		if (trouveOrigine && trouveExtremite) {
			graphe.listeArcs.add(this);
		} else {
			// message d'erreur
			StringBuffer erreur = new StringBuffer("Erreur arc: ("
					+ nomNoeudOrigine + " -> " + nomNoeudExtremite + ")\n   ");
			if (!trouveOrigine)
				erreur.append(nomNoeudOrigine + "? ");
			if (!trouveExtremite)
				erreur.append(nomNoeudExtremite + "? ");
			System.out.println(erreur);
		}

	}

	public Noeud getNoeudOrigine() {
		return noeudOrigine;
	}

	public Noeud getNoeudExtremite() {
		return noeudExtremite;
	}

	public String toString() {
		return new String("   arc: ( " + this.getNoeudOrigine().getNom()
				+ " -> " + this.getNoeudExtremite().getNom() + " )");
	}

}