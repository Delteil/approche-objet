/*Exercice 1
Apprenez à manipuler une liste d’entiers
• Créer un nouveau package listes.
• Dans le package listes, créez une classe TestListeInt exécutable.
• Dans cette classe instanciez une ArrayList d’entiers et placez y les éléments suivants :
o -1, 5, 7, 3, -2, 4, 8, 5
• Affichez tous les éléments de la liste
• Recherchez le plus grand élément de la liste
• Supprimez le plus petit élément de la liste
• Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent
positifs.
• Affichez enfin la liste résultante
 */

package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> listeInt = new ArrayList<Integer>();

		// Methode 1 : on ajoute les données une/une
//		listeInt.add(-1);
//		listeInt.add(5);
//		listeInt.add(7);
//		listeInt.add(3);
//		listeInt.add(-2);
//		listeInt.add(4);
//		listeInt.add(8);
//		listeInt.add(5);
//
//		for (Integer integer : listeInt) {
//
//		}
//
//		System.out.println(listeInt);

		// Méthode 2 : avec collection

//		 Liste liste = new ArrayList(); 
//		 String[] titres = {"titre1, titre2, titre3"}; // avec Integer pour les numeriques
//		 Collections.addAll(liste, titres);
//		// Affichage
//		for (int i = 0; i < liste.size(); i++)
//			System.out.println(al.get(i));
//			}
//		}

		// Méthode 3 : création d'un tableau puis ajout de toutes les valeurs du tableau
		// dans listArray

		Integer[] liste = { -1, 5, 7, 3, -2, 4, 8, 5 };
		listeInt.addAll(Arrays.asList(liste));

		System.out.println(listeInt);

		// Afficher la valeur Max de la liste

		// ancienne méthode

//		int vMax = Integer.MIN_VALUE;
//
//		for (Integer integer : liste) {
//
//			if (integer > vMax) {
//
//				vMax = integer;
//			}
//		}
//
//		System.out.println(vMax);
//		

		// Collections.max(listeInt);
		System.out.println("valeur maximale de la liste est " + Collections.max(listeInt));

		// Afficher la liste sans la plus petite valeur

		// listeInt.remove(Collections.min(listeInt)); //Collection.min ou .max
		// fonctionne que sur les numeriques

		System.out.println("valeur minimale de la liste est " + Collections.min(listeInt));

		// System.out.println(listeInt.remove(Collections.min(listeInt))); //Affiche
		// true = oui, retiré de la liste

		listeInt.remove(Collections.min(listeInt));
		System.out.println("voici la liste sans la valeur min : " + listeInt);

		// Rechercher tous les éléments négatifs et les modifier pour qu'ils deviennent
		// positifs

	}

}
