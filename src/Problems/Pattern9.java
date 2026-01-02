package Problems;

public class Pattern9 {
        public static void main(String[] args) {

            int rows = 5;

            // Upper pyramid
            for (int i = 1; i <= rows; i++) {

                // spaces
                for (int s = i; s < rows; s++) {
                    System.out.print("  ");
                }

                // stars
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            // Lower inverted pyramid
            for (int i = rows - 1; i >= 1; i--) {

                // spaces
                for (int s = rows; s > i; s--) {
                    System.out.print("  ");
                }

                // stars
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }


