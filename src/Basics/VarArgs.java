package Basics;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        greet(20,30,40,50,70);

    }
    static void greet(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
