package Basics;
import java.util.Scanner;

public class Method {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name:");
        String name= in.next();

        String names=greet(name);
        System.out.println(names);

        }
        static String greet(String name){

             String message=name;
             return message;

        }

    }

