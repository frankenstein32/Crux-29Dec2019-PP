package L2_Jan4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jan-2020
 *
 */

public class Pattern5 {

	public static void main(String[] args) {

		int n = 10;

		int row = 1;

		int nsp = 0 ;
		int nst = n ;

		while (row <= n) {

			// work

			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}

			// prep
			System.out.println();
			row = row + 1;
			nsp = nsp + 2;
			nst = nst - 1;

		}

	}
}
