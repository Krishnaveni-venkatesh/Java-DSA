package Basics;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //greet(20,30,40,50,70);
        mixed(10,20,"krishnaveni","chandana");

    }
    //static void greet(int ...v){
    //static void multiple(int a,int b,String ...v){
    static void mixed(Object...v){
        System.out.println(Arrays.toString(v));

    }



    }





