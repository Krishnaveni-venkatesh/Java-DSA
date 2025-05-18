//input=16
//output =True #finding if the number is power of two
package Problems;

public class PowerOfTwo {
    public static boolean findindIfTheNumbersPower(int n){
        if(n==1){
            return true;

        }
        if(n<1){
            return false;
        }
          if(n%2 !=0){
            return false;
        }
          return findindIfTheNumbersPower(n/2);

    }
    public static void main(String[] args){
        int n=1024;
        boolean result=findindIfTheNumbersPower(n);
        System.out.println(result);
    }
}
