/*
POO – EXCEPTIONS

Saisie d’entiers :
Ecrire un programme qui demande à l'utilisateur de saisir des entiers, qui les additionne, et qui affiche
le résultat à l'utilisateur en fin de saisie.
Quand l'utilisateur indique une valeur non numérique, le programme doit gérer cette erreur avec
l'exception "NumberFormatException" : la saisie est alors ignorée et une nouvelle valeur est demandé
à l'utilisateur.
La saisie s'arrête quand l'utilisateur n'indique pas de valeur et valide la saisie.
 */

package exeptions;

import java.util.Scanner;

public class PooExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean fin = false;
		int somme = 0;

		while (!fin) {
			// demande de saisie d'entiers à USER

			System.out.println("Veuillez saisir des entiers");
			String entier = sc.nextLine();
			try {
				if (entier.equals("")) { // .equals avec des String, équivalent au == avec int
					fin = true;
				}
				somme = somme + Integer.parseInt(entier); // transforme le String en int

			} catch (NumberFormatException e) {
				Exception e1 = new Exception("Veuillez saisir un nouvel entier");
				System.out.println(e1);

			} finally {

				System.out.println(somme);
			}
		}
		sc.close();
	}
}
