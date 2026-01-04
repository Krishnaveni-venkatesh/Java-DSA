/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 */
package Problems;

public class Pattern20 {
    public static void pat20(int n){
        int inspaces=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n)stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=inspaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) inspaces-=2;
            else inspaces+=2;
        }
    }
    public static void main(String[] args){
        pat20(5);
    }
}
