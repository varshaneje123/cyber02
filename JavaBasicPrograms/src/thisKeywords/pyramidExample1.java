package thisKeywords;

public class pyramidExample1 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= 5; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********************************");

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j <= 6; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("**********************************");

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j <= 6; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("**********************************");

		for (int i = 6; i >= 0; i--) {

			for (int j = 6; j >= 0; j--) {

				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("===============================78");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("===============================************");

		for (int i = 5; i >= 1; --i) {

			for (int j = 1; j <= i; ++j) {

				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===============================************");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("===============================************");
		for (int i = 5; i >= 1; --i) {

			for (int j = 1; j <= i; ++j) {

				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================************");

		for (int i = 65; i <= 69; ++i) {

			for (int j = 65; j <= i; ++j) {

				System.out.print((char) i);
			}
			System.out.println();
		}
		System.out.println("===============================************");
		int count1 = 1;
		int count2 = 1;

		int count3 = 1;

		for (int i = 5; i >= 1; --i) {

			for (int j = 1; j <= i; ++j) {
				System.out.print(" ");
			}

			for (int k = count2; k <= count1; k++) {
				System.out.print(k + " ");
			}
			count2++;
			count1 = count1 + 2;
			count3 = count1;
			
			for (int d = count2; count1 < d; d--) {
				System.out.print(d + " ");
			}

			System.out.println();
		}
	}
}