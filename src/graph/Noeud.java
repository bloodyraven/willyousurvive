package graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class Noeud {
	private String nom;
	private Graphe graphe;
	private String message;
	private boolean visited;

	// actions autorisées
	// objets trouvables

	public Noeud(String nom, String message, Graphe graphe) {
		this.nom = nom;
		this.graphe = graphe;
		this.message=message;
		graphe.listeNoeuds.add(this);
	}

	public Object[] getChildren(Noeud noeud) {
		LinkedList<Noeud> children = new LinkedList<Noeud>();
		ListIterator<Arc> liArc = graphe.listeArcs.listIterator();
		while (liArc.hasNext()) {
			Arc arcCourant = liArc.next();
			if (arcCourant.getNoeudOrigine().getNom().equals(noeud.getNom())) {
				children.add(arcCourant.getNoeudExtremite());
			}
		}
		return children.toArray();
	}

	public String getNom() {
		return nom;
	}

	public Boolean hasChildren() {
		return (getChildren(this).length != 0);
	}

	public String toString() {
		return new String("   noeud: " + this.getNom());
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}