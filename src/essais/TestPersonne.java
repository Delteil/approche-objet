package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne personne1 = new Personne("Delteil", "Amandine");

		/*
		 * personne1.nom = "Delteil"; 
		 * personne1.prenom = "Amandine";
		 */
		personne1.adresse.codePostal = 34150;
		personne1.adresse.nomRue = "lotissement Cazanove";
		personne1.adresse.numeroRue = 8;
		personne1.adresse.ville = "Montpeyroux";

		Personne personne2 = new Personne();

		/*
		 * personne2.nom = "Tasselli"; 
		 * personne2.prenom = "Laurence";
		 */
		personne2.adresse.codePostal = 34150;
		personne2.adresse.nomRue = "chemin des plantades";
		personne2.adresse.numeroRue = 334;
		personne2.adresse.ville = "Saint Jean de Fos";

		personne1.affichePersonne();

		System.out.println();

		personne2.affichePersonne();

		/*
		 * Conclusion Que pensez-vous du nombre de lignes de code nécessaires pour
		 * instancier (i.e. créer) une personne ? il est possible de réduire le nombre
		 * de ligne en créant un constructeur dans le fichier personne. ainsi l'on
		 * utilise qu'une seule ligne pour chaque nouvelle personne instanciée.
		 */

	}

}
