package Problems;

public class Patterns {
   public  static void pattern1(int n){
        for(int row = 1;row <= n;row++){
            for(int col = 1;col <=row;col++){
                System.out.print("* ");
            }
        System.out.println( );
        }
    }
    /* output:
       *
       * *
       * * *
       * * * *
       * * * * *
     */
    public  static void pattern2(int n){
        for(int row = 1;row <= n;row++){
            for(int col = 1;col <=n;col++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    /* output:
       * * * * *
       * * * * *
       * * * * *
       * * * * *
       * * * * *
     */
    public  static void pattern3(int n){
        for(int row = 1;row <= n;row++){
            for(int col = 1;col<= (n-row) + 1;col++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    /*
    output:* * * * *
           * * * *
           * * *
           * *
           *

     */
    public  static void pattern4(int n){
        for(int row = 1;row <= n;row++){
            for(int col = 1;col <=row;col++){
                System.out.print(col +" ");
            }
            System.out.println( );
        }
    }
    /* output:
       1
       1 2
       1 2 3
       1 2 3 4
       1 2 3 4 5
     */
    public  static void pattern5(int n){
        for(int row = 0;row <= 2 * n;row++){
            int totalColInRow = row > n ? 2 * n - row - 1 :row;
            for(int col = 0;col < totalColInRow;col++){
                System.out.print(" *");
            }
            System.out.println( );
        }
    }
    /* output:
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    public static void main(String[] args){
        int n=5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
    }
}
