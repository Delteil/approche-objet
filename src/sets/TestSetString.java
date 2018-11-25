/* Exercice 2
Apprenez à manipuler un set de String
• Dans le package sets, créez une classe TestSetString exécutable.
• Dans cette classe instanciez un HashSet de String contenant les éléments suivants :
o USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
• Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
• Supprimez ce pays
• Modifiez le contenu de la liste de manière à mettre tous les noms de pays en majuscules.
• Affichez enfin le contenu de la collection ainsi modifiée
 */

package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {

		int chaineMax = Integer.MIN_VALUE;
		String paysLongMax = null;

		HashSet<String> set = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();

		set.add(new String("USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde"));

		Iterator<String> it = set.iterator(); // on crée un Iterator pour parcourir notre HashSet

		while (it.hasNext()) { // tant qu'on a un suivant

			System.out.println(it.next());
		}

		// Recherchez le pays dans cette liste qui a le plus grand nombre de lettres.
		// Supprimez ce pays
	
		while (it.hasNext()) {

			String chaine = it.next(); // la variable chaine prend la valeur de l'itérateur

			int longueurChaine = chaine.length();


			if (longueurChaine > chaineMax) { // si la chaine a une longueur supérieure à longueur max

				chaineMax = longueurChaine; // alors chaine max prend la valeur de la longueur de la
														// chaine et on récupère le mot qui correspond
				paysLongMax = chaine;

			}
		}

		// suppression du mot le plus long
		set.remove(paysLongMax);

		Iterator<String> it2 = set.iterator(); // nouveau iterator

		while (it2.hasNext()) { // tant qu'il y a une valeur dans l'itérateur

			String chaine = it2.next(); // chaine prend la valeur de l'iterator

			chaine = chaine.toUpperCase();

			set2.add(chaine);
		}

		System.out.println(set2);

	
	}
	

}
