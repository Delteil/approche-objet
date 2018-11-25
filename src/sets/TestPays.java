/*Exercice 3
Apprenez à manipuler un set d’Objets
• Créez une classe Pays possédant 3 attributs : nom, nb d’habitants, PIB/habitant.
• Créez un HashSet de pays contenant les pays suivants avec les informations correctes
de nombre d’habitants et de PIB/Hab:
o USA
o France.
o Allemagne.
o UK.
o Italie.
o Japon.
o Chine.
o Russie.
o Inde
• Recherchez le pays avec le PIB/habitant le plus important
• Recherchez le pays avec le PIB total le plus important
• Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le
plus petit
• Supprimez le pays dont le PIB total est le plus petit
• Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB
total
 */

package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {

		// declaration et initialisation des variables

		Double pibHabitantMax = Double.MIN_VALUE;
		String paysPibHabitantMax = null;
		Long pibPays = null;
		Long pibPaysMax = Long.MIN_VALUE;
		String nomPibPaysMax = null;
		Long pibPaysMin = Long.MAX_VALUE;
		Pays pibMin = null;

		HashSet<Pays> setPays = new HashSet<Pays>();

		// ajout des pays à la liste setPays
		setPays.add(new Pays("USA", 325700000, 59531.66));
		setPays.add(new Pays("France", 67200000, 38476.66));
		setPays.add(new Pays("Allemagne", 82790000, 44469.91));
		setPays.add(new Pays("UK", 66020000, 39720.44));
		setPays.add(new Pays("Italie", 60590000, 31952.98));
		setPays.add(new Pays("Japon", 126800000, 38428.10));
		setPays.add(new Pays("Chine", 1386000000, 8826.99));
		setPays.add(new Pays("Russie", 144500000, 10743.10));
		setPays.add(new Pays("Inde", 1339000000, 1939.61));

		Iterator<Pays> it = setPays.iterator();

		while (it.hasNext()) {

			Pays pays = it.next();

			// • Recherchez le pays avec le PIB/habitant le plus important

			if (pays.getPibHab() > pibHabitantMax) {

				pibHabitantMax = pays.getPibHab();
				paysPibHabitantMax = pays.getNom();

			}
		}

		System.out.println("Pays dont le PIB/habitant est le plus important : " + paysPibHabitantMax);

		// calcul du pib total / pays

		for (Pays pays : setPays) {

			pibPays = (long) (pays.getPibHab() * pays.getNbHab());

			// • Recherchez le pays avec le PIB total le plus important

			if (pibPays > pibPaysMax) {

				pibPaysMax = pibPays;
				nomPibPaysMax = pays.getNom();

			}

			// • Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le
			// PIB total le

			if (pibPays < pibPaysMin) {

				pibPaysMin = pibPays;
				pibMin = pays;

				pibMin.setNom(pibMin.getNom().toUpperCase());

			}
		}

		System.out.println("Pays dont le PIB total est le plus important : " + nomPibPaysMax);

		setPays.remove(pibMin);

		for (Pays pays : setPays) {

			Long pibTotalPays = (long) (pays.getPibHab() * pays.getNbHab());

			System.out.println("Nom : " + pays.getNom() + ",  nbre d'habitants : " + pays.getNbHab()
					+ ",   pib total : " + pibTotalPays);

		}

	}

}
