/*Projet approche-objet TP2
• Ajoutez un constucteur à la classe Personne avec les paramètres permettant de
valorisez nom et prénom.
• Modifiez la classe TestPersonne afin d’utiliser le nouveau constructeur de la classe
Personne.
• Ajoutez un second constructeur à la classe Personne avec les 3 paramètres permettant
de valoriser les attributs nom, prenom et adresse.
• Modifiez la classe TestPersonne afin d’utiliser le second constructeur de la classe
Personne.
 */

/*Projet approche-objet TP3
•Dans la classe Personne, ajoutez une méthode toString() qui permet d’afficher 
le nom et le prénom avec le nom de famille en majuscules. 
•Dans  la  classe Personne,  ajoutez  une  méthode setNom()qui  permet  de  modifier le nom.
•Dans la classe Personne, ajoutez une méthode setPrenom() permet de modifier le prénom.
•Dans  la  classe Personne, ajoutez une méthode setAdresse()qui permet de modifier l’adresse.
•Dansla classe Personne, ajoutez une méthode getNom() qui retourne le nom.
•Dans la classe Personne, ajoutez une méthode getPrenom() qui retourne le prénom.
•Dans la classe Personne, ajoutez une méthode getAdresse()qui retourne l’adresse.
•Modifier la classe TestPersonne de manière à utiliser le premier constructeur de 
la classe Personne pour valoriser  les  attributs nom et prenom ainsi  que la  méthode setAdresse()
qui permet de modifier l’adresse pour valoriser l’adresse*/

/*Ajout d’attribut et méthodes
•Dans la classe Personne, ajoutez un attribut «anneeNaissance».
•Ajouter les méthodes getAnneeNaissance() et setAnneeNaissance() dans  la  classe pour ce 
nouvel attribut.
•Ecrivez une méthode getAge() qui retourne l’âge de la personne.
•Tester ces modificatifs dans la méthode main().
 */

package entites;

public class Personne {

	// TP 1

	public String nom = "";
	public String prenom = "";
	public AdressePostal adresse = new AdressePostal();
	public int anneeNaissance = -1; // nouvel attribut
	
	// TP 2
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne() {

	}

	// TP 3 - méthode toString, setter/getter et ajout attribut

	public String toString() {
		return "Nom => " + nom.toUpperCase() + " Prénom => " + prenom.toLowerCase();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostal getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostal adresse) {
		this.adresse = adresse;
	}

	public int getAnneeNaissance() { //get/set du nouvel attribut
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	
	public int getAge() {
		return 2018-anneeNaissance;
	}

	public void affichePersonne() {
		System.out.println("Nom => " + nom + " Prénom => " + prenom);
		adresse.afficheAdressePostal();
	}
}
