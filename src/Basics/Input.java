package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        sc.nextLine();//to get a line space
        System.out.println("enter your name:");
        String name=sc.next();

        //String name=sc.nextLine();//to print a line
    }
}
