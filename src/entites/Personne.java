/*Projet approche-objet
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

public class Personne {

	public String nom = "";
	public String prenom = "";
	public AdressePostal adresse = new AdressePostal();

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne() {
		
	}

	public void affichePersonne() {
		System.out.println("Nom => " + nom + " Prénom => " + prenom);
		adresse.afficheAdressePostal();

	}

}
