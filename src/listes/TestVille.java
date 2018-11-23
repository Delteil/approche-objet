/*Exercice 3
Apprenez à manipuler une liste d’objets
• Créez une classe Ville possédant 2 attributs : nom, nb d’habitants.
• Créez une ArrayList de villes contenant les villes suivantes :
o Nice, 343 000 hab.
o Carcassonne, 47 800 hab.
o Narbonne, 53 400 hab.
o Lyon, 484 000 hab.
o Foix, 9 700 hab.
o Pau, 77 200 hab.
o Marseille, 850 700 hab.
o Tarbes, 40 600 hab.
• Recherchez la ville la plus peuplée
• Supprimez la ville la moins peuplée
• Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
• Affichez enfin la liste résultante
 */

package listes;

import java.util.ArrayList;
import java.util.Collections;

import listes.Ville;

public class TestVille {

	public static void main(String[] args) {

		Ville ville = new Ville(null, 0);

		ArrayList<Ville> liste = new ArrayList<Ville>();

		Ville[] villes = { new Ville("Nice", 340000), new Ville("Carcassone", 47800), new Ville("Narbonne", 53400),
				new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Pau", 77200),
				new Ville("Marseille", 850700), new Ville("Tarbes", 40600) };

		Collections.addAll(liste, villes);

		System.out.println(liste);

		// recherche de la ville la + peuplée

		int maxHab = Integer.MIN_VALUE;
		int indexVilleMaxHab = 0;

		for (Ville nbHab : liste) {

			if (nbHab.getNbHab() > maxHab) {

				maxHab = nbHab.getNbHab();
				indexVilleMaxHab = liste.indexOf(nbHab);
			}
		}

		System.out.println("la ville la + peuplée est " + liste.get(indexVilleMaxHab).getNom().toUpperCase());
		System.out.println();

		// Supprimez la ville la moins peuplée

		int minHab = Integer.MAX_VALUE;
		int indexMinHab = 0;

		for (Ville nbHab : liste) {

			if (nbHab.getNbHab() < minHab) {

				minHab = nbHab.getNbHab();
				indexMinHab = liste.indexOf(nbHab);
			}
		}

		System.out.println("la ville la - peuplée est " + liste.get(indexMinHab).getNom().toUpperCase());
		System.out.println();
		liste.remove(indexMinHab);
		System.out.println(liste);

		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en
		// majuscules

		for (Ville villeMaj : liste) {

			if (villeMaj.getNbHab() > 100000) {

				villeMaj.setNom(villeMaj.getNom().toUpperCase());
			}
		}
		System.out.println(liste + ville.getNom() + " " + ville.getNbHab());
	}
}
