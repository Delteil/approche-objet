/*Exercice 3
Apprenez à manipuler un set d’Objets
• Créez une classe Pays possédant 3 attributs : nom, nb d’habitants, PIB/habitant.
• Créez un HashSet de pays contenant les pays suivants avec les informations correctes
de nombre d’habitants et de PIB/Hab:
o USA
o France.
o Allemagne.
o UK.
o Italie.
o Japon.
o Chine.
o Russie.
o Inde
• Recherchez le pays avec le PIB/habitant le plus important
• Recherchez le pays avec le PIB total le plus important
• Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le
plus petit
• Supprimez le pays dont le PIB total est le plus petit
• Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB
total
 */

package sets;

public class Pays {

	// attributs de la classe Pays
	private String nom = null;
	private int nbHab = 0;
	private double pibHab = 0;

	public Pays(String nom, int nbHab, double pibHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}

	public Pays() {

	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHab=" + nbHab + ", pibHab=" + pibHab + "]\r\n";
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

	public double getPibHab() {
		return pibHab;
	}

	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}

}
