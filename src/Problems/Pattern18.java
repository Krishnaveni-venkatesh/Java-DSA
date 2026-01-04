/*
E
DE
CDE
BCDE
ABCDE
 */

package Problems;

public class Pattern18 {
    public static void pat18(int n){
        for(int i=0;i<n;i++){
            for(char ch =(char)('E'-i);ch<= 'E';ch++){
                System.out.print(ch);

            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        pat18(5);
    }
}

