/*
A B C D E
A B C D
A B C
A B
A

 */
package Problems;

public class Pattern15 {
    public static void pat15(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch <='A'+(n-i-1);ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        pat15(5);
    }

}
