/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
or
* * * * *
* * * *
* * *
* *
*
 */

package Problems;

public class Pattern5 {
    public static void pat5(int n){
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                //System.out.print("* ");
                System.out.print(j +" ");
            }
         System.out.println() ;
        }
    }
    public static void main(String[] args){
        int n=5;
        pat5(n);
    }
}
