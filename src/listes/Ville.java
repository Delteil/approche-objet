/*Exercice 3
Apprenez à manipuler une liste d’objets
• Créez une classe Ville possédant 2 attributs : nom, nb d’habitants.
• Créez une ArrayList de villes contenant les villes suivantes :
o Nice, 343 000 hab.
o Carcassonne, 47 800 hab.
o Narbonne, 53 400 hab.
o Lyon, 484 000 hab.
o Foix, 9 700 hab.
o Pau, 77 200 hab.
o Marseille, 850 700 hab.
o Tarbes, 40 600 hab.
• Recherchez la ville la plus peuplée
• Supprimez la ville la moins peuplée
• Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
• Affichez enfin la liste résultante
 */


package listes;

public class Ville {
	
	
	private String nom = null;
	private int nbHab = 0;
	
	public Ville(String nom, int nbreHab) {
		super();
		this.nom = nom;
		this.nbHab = nbreHab;
	}
		
	@Override
	public String toString() {
		return "nom = " + nom + ", nbHab = " + nbHab + "\r\n";
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbHab() {
		return nbHab;
	}


	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
}