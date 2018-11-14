package essais;

import entites.AdressePostal;

public class TestAdressePostal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostal adresse1 = new AdressePostal();

		adresse1.numeroRue = 8;
		adresse1.nomRue = "lotissement Cazanove";
		adresse1.codePostal = 34150;
		adresse1.ville = "Montpeyroux";

		adresse1.afficheAdressePostal();
		
		
		AdressePostal adr2 = new AdressePostal();
		
		adr2.numeroRue = 5;
		adr2.codePostal = 34725;
		adr2.nomRue = "la placette";
		adr2.ville = "Jonquières";
		
		adr2.afficheAdressePostal();
		
	}
}
