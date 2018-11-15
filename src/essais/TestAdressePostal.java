package essais;

import entites.AdressePostal;

public class TestAdressePostal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostal adresse1 = new AdressePostal(8, "lotissement Cazanove", 34150, "Montpeyroux");

		AdressePostal adresse2 = new AdressePostal(5, "la Placette", 34725, "Jonquières");

		adresse1.afficheAdressePostal();
		adresse2.afficheAdressePostal();

	}
}
