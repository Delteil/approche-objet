/*Exercice 1
Apprenez à manipuler un set de doubles
• Créer un nouveau package sets.
• Dans le package sets, créez une classe TestSetDouble exécutable.
• Dans cette classe instanciez un HashSet de doubles et placez y les éléments suivants :
o 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
• Affichez tous les éléments de la collection
• Recherchez le plus grand élément de la collection
• Supprimez le plus petit élément de la collection
• Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent
positifs.
• Affichez enfin le contenu de la collection ainsi modifiée
 */

package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<Double>();

	// méthode d'ajour un à un
		set.add(1.5);
		set.add(8.25);
		set.add(-7.25);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);

		
	//méthode d'ajout d'un coup
		
		//set.add(new Double(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		//Iterator<Double> it = set.iterator(); // on crée un Iterator pour parcourir notre HashSet
		//while (it.hasNext()) { // tant qu'on a un suivant
		
			//System.out.println(it.next());
		//}
		
		//System.out.println(set);
		System.out.println();

		// Recherchez le plus grand élément de la collection

		System.out.println(Collections.max(set));
		System.out.println();

		// Supprimez le plus petit élément de la collection

		System.out.println(Collections.min(set));
		set.remove(Collections.min(set));
		System.out.println(set);
		System.out.println();

		// Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils
		// deviennent positifs.

		Iterator<Double> it = set.iterator();
		while (it.hasNext()) {
			Double elem = it.next();

			if (elem < 0) {
				set.remove(elem);
				elem = Math.abs(elem);
				set.add(elem);
			}
		}
		System.out.println(set);
	}
}
