package essais;

import entites.AdressePostal;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne personne1 = new Personne("Delteil", "Amandine");
		personne1.adresse = new AdressePostal(8, "lotissement Cazanove", 34150, "Montpeyroux");

		/*
		 * personne1.nom = "Delteil"; personne1.prenom = "Amandine";
		 */
		/*
		 * personne1.adresse.codePostal = 34150; personne1.adresse.nomRue =
		 * "lotissement Cazanove"; personne1.adresse.numeroRue = 8;
		 * personne1.adresse.ville = "Montpeyroux";
		 */

		Personne personne2 = new Personne("Tasselli", "Laurence");
		personne2.adresse = new AdressePostal(334, "chemin des Plantades", 34150, "Saint Jean de Fos");
		/*
		 * personne2.nom = "Tasselli"; personne2.prenom = "Laurence";
		 */
		/*
		 * personne2.adresse.codePostal = 34150; personne2.adresse.nomRue =
		 * "chemin des plantades"; personne2.adresse.numeroRue = 334;
		 * personne2.adresse.ville = "Saint Jean de Fos";
		 */

		personne1.affichePersonne();

		System.out.println();

		personne2.affichePersonne();

	}

}
