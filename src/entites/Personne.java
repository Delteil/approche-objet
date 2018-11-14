package entites;

public class Personne {

	public String nom = "";
	public String prenom = "";
	public AdressePostal adresse = new AdressePostal();
	
	public void affichePersonne() {
		System.out.println("Nom => " + nom + " Prénom => " + prenom);
		 adresse.afficheAdressePostal();
		 
	}
	
}
