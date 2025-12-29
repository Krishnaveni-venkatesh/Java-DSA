/*
      *
    * * *
  * * * * *
 * * * * * * *
* * * * * * * * *
 */


package Problems;

public class Pattern7 {
    public static void pat7(int n){
        for(int i=0;i<n;i++){
            // space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++) {
                //star
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                //space
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
        pat7(n);
    }
}
