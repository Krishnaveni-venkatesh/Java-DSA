/*
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 */
package Problems;

public class Pattern19 {
    public static void pat19(int n){
        int inspace=0;
        for(int i=0;i<n;i++){
            //star
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inspace;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            inspace+=2;
            System.out.println();
        }
         inspace=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inspace;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            inspace-=2;
            System.out.println();

        }
    }
    public static void main(String[] args){
        pat19(5);
    }

}
