package array;

public class EvenPositions {
	
	static int ab[]={77,88,99,33,66,55,198,45,88,26,81};
	static int siva(int arrs[], int n) {
		int i = 0, sum = 0;
		for (i = 0; i < n; i++) {

		if ((i % 2 != 0)) {
		sum += arrs[i];


		}
		}
		return sum;

		}

		public static void main(String[] args) {
		int n = ab.length;
		System.out.println(" " + siva(ab, n));

		}
}
		
