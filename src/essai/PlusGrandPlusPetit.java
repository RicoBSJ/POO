package essai;

public class PlusGrandPlusPetit {

	public static void main(String[] args) {
		
		int[] liste = { 0, 5, 9, 3, 2 };

		public PlusGrandPlusPetit(int max_actuel) {
			max_actuel = 0;
			for (int elem : liste) {
				if (elem > max_actuel) {
					max_actuel = elem;
					return max_actuel;
				}
			}
		}
	}
}
