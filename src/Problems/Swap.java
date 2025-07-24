package Problems;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        int[] result=swapNumbers(10,20);
        System.out.println(Arrays.toString(result));

    }
    static int[] swapNumbers(int a,int b){
        int Temp=a;
        a=b;
        b=Temp;
        return new int[]{a,b};

    }
}
