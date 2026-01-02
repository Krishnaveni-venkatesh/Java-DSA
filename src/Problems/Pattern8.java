/*
  *  *  *  *  *  *  *  *  *
     *  *  *  *  *  *  *
        *  *  *  *  *
           *  *  *
              *

 */

package Problems;

public class Pattern8 {

    public static void pat8(int n) {

        // Upper inverted pyramid
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower pyramid
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pat8(n);
    }
}

