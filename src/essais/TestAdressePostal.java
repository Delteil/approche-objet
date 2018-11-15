package essais;

import entites.AdressePostal;

public class TestAdressePostal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TP1
		
		/*AdressePostal adresse1 = new AdressePostal();

		adresse1.numeroRue = 8;
		adresse1.nomRue = "lotissement Cazanove";
		adresse1.codePostal = 34150;
		adresse1.ville = "Montpeyroux";

		adresse1.afficheAdressePostal();
		
		
		AdressePostal adresse2 = new AdressePostal();
		
		adresse2.numeroRue = 5;
		adresse2.codePostal = 34725;
		adresse2.nomRue = "la placette";
		adresse2.ville = "Jonquières";
		
		adresse2.afficheAdressePostal();
		*/
		
		//TP2
		
		AdressePostal adresse1 = new AdressePostal(8,"lotissement Cazanove",34150,"Montpeyroux");
		AdressePostal adresse2 = new AdressePostal(5,"la Placette",34725,"Jonquières");
		adresse1.afficheAdressePostal();
		adresse2.afficheAdressePostal();

	}
}
