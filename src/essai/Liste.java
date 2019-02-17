package essai;

public class Liste {

	int[] liste = { 0, 5, 9, 3, 2 };

	public void PlusGrandPlusPetit(int max_actuel) {
		max_actuel = 0;
		for (int elem : liste) {
			if (elem > max_actuel) {
				max_actuel = elem;
				return;
			}
		}
	}
}
