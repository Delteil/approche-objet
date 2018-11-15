package essais;

import entites.AdressePostal;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TP 1
		System.out.println("TP1");
		Personne personne1 = new Personne();
		personne1.adresse = new AdressePostal();

		personne1.nom = "Delteil";
		personne1.prenom = "Amandine";

		personne1.adresse.codePostal = 34150;
		personne1.adresse.nomRue = "lotissement Cazanove";
		personne1.adresse.numeroRue = 8;
		personne1.adresse.ville = "Montpeyroux";

		Personne personne2 = new Personne();
		personne2.adresse = new AdressePostal();

		personne2.nom = "Tasselli";
		personne2.prenom = "Laurence";

		personne2.adresse.codePostal = 34150;
		personne2.adresse.nomRue = "chemin des plantades";
		personne2.adresse.numeroRue = 334;
		personne2.adresse.ville = "Saint Jean de Fos";

		personne1.affichePersonne();
		System.out.println();
		personne2.affichePersonne();

		// TP 2
		System.out.println("TP2");
		Personne personne3 = new Personne("Delteil", "Amandine");
		personne3.adresse = new AdressePostal(8, "lotissement Cazanove", 34150, "Montpeyroux");

		Personne personne4 = new Personne("Tasselli", "Laurence");
		personne4.adresse = new AdressePostal(334, "chemin des Plantades", 34150, "Saint Jean de Fos");

		personne3.affichePersonne();
		System.out.println();
		personne4.affichePersonne();

		// TP 3
		System.out.println("TP3");
		Personne personne5 = new Personne("delteil", "AMAndine");
		personne5.adresse = new AdressePostal(12, "Lot. Caza", 34150, "Gignac");
		personne5.setAdresse(personne5.getAdresse());
		personne5.getAge();

		System.out.println(personne5.toString());
		personne5.getAdresse().afficheAdressePostal();
		personne5.setAnneeNaissance(1983); // renseignement du paramètre annee de naissance
		System.out.println(personne5.getAge() + " ans"); // retourne l'age

	}
}
