/*Projet approche-objet
• Reprenez la classe AdressePostale précédente et ajoutez lui un constructeur avec les 4
paramètres permettant de valoriser tous les attributs de la classe.
• Modifiez la classe TestAdressePostale afin d’utiliser le constructeur.
• Ajoutez un constucteur à la classe Personne avec les paramètres permettant de
valorisez nom et prénom.
• Modifiez la classe TestPersonne afin d’utiliser le nouveau constructeur de la classe
Personne.
• Ajoutez un second constructeur à la classe Personne avec les 3 paramètres permettant
de valoriser les attributs nom, prenom et adresse.
• Modifiez la classe TestPersonne afin d’utiliser le second constructeur de la classe
Personne.
 */

package entites;

public class AdressePostal {

	public int numeroRue = -1;
	public String nomRue = "";
	public int codePostal = 0;
	public String ville = "";

	// Création du constructeur

	public AdressePostal(int numeroRue, String nomRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;

	}

	// constructeur vide

	public AdressePostal() {

	}

	public void afficheAdressePostal() {
		System.out.println("numéro de rue => " + numeroRue + " nom de la rue => " + nomRue + " code postal => "
				+ codePostal + " ville => " + ville);
	}
}
