import java.util.Scanner;

class Pattern22 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Rows:- ");
		int row = scanner.nextInt();

		int star = 0;
		scanner.close();
		for (int i = 0; i < row-1; i++) {

			for (int k = 0; k <= star; k++) {
				System.out.print("*" + " ");
			}

			System.out.println();

			if (i < row / 2) {

			
				star += 1;
			} else {
				
				star -= 1;
			}
		}

		star = 0 ;
		for (int i = 0; i < row; i++) {


			for (int k = 0; k <= star; k++) {
				System.out.print("*" + " ");
			}

			System.out.println();

			if (i < row / 2) {

			
				star += 1;
			} else {
				
				star -= 1;
			}
		}

	}
}
