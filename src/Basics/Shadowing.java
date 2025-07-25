package Basics;

public class Shadowing {
    static int x=90;
    public static void main(String[] args){
        System.out.println(x);
        int x=99;
        System.out.println(x);
        number();

    }
    static void number(){
        System.out.println(x);
    }
}
