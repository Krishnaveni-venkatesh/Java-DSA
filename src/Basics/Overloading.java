package Basics;

public class Overloading {
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(String n){
        System.out.println(n);
    }
    public static void main(String[] args){
        sum(2,3);
        sum("krishnaveni");
    }
}
