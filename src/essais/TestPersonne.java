package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personne1 = new Personne();
		
		personne1.nom = "Delteil";
		personne1.prenom = "Amandine";
		personne1.adresse.codePostal = 34150;
		personne1.adresse.nomRue = "lotissement Cazanove";
		personne1.adresse.numeroRue = 8;
		personne1.adresse.ville = "Montpeyroux";
		
		personne1.affichePersonne();
		
		System.out.println();
		
		Personne personne2 = new Personne();
		
		personne2.nom = "Tasselli";
		personne2.prenom = "Laurence";
		personne2.adresse.codePostal = 34150;
		personne2.adresse.nomRue = "chemin des plantades";
		personne2.adresse.numeroRue = 334;
		personne2.adresse.ville = "Saint Jean de Fos";
		
		personne2.affichePersonne();
		
		
				
		
	}

}
