/*Exercice 2
Apprenez à manipuler une liste de chaines de caractères.
• Dans le package listes, créez une classe TestListeString exécutable.
• Dans cette classe instanciez une ArrayList de String contenant les éléments suivants :
	o Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
• Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
• Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
majuscules.
• Supprimez de la liste les villes dont le nom commence par la lettre N.
• Affichez la liste résultante
 */

package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeString {

	public static void main(String[] args) {

		String[] villes = { "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes" };

		ArrayList<String> listeString = new ArrayList<String>();
		listeString.addAll(Arrays.asList(villes));
		System.out.println(listeString);

		// Recherchez la ville dans cette liste qui a le plus grand nombre de lettres

		String stringLePlusLong = "";

		for (String string : listeString) {

			if (string.length() > stringLePlusLong.length()) {

				stringLePlusLong = string;
			}
		}
		System.out.println();
		System.out.println("la ville avec le plus de lettre est " + stringLePlusLong.toUpperCase());

		// Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules

		listeString.replaceAll(String::toUpperCase);
		System.out.println();
		System.out.println(listeString);
		System.out.println();

		// Supprimez de la liste les villes dont le nom commence par la lettre N.

		for (int i = 0; i < listeString.size(); i++) {

			if (listeString.get(i).startsWith("N", 0)) { // suppression de la 1ere lettre N du String = 0

				System.out.print(listeString.get(i) + " ");
				listeString.remove(listeString.get(i));
			}

		}
		System.out.println();
		System.out.println(listeString);
	}
}
