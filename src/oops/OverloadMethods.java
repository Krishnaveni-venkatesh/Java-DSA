package oops;

public class OverloadMethods {
    public static void main(String[] args){
        int x=add(5,6);
        System.out.println(x);
        int y=add(5,6,7);
        System.out.println(y);
        int z=add(5,6,7,8);
        System.out.println(z);

    }
    static int add(int a,int b){
        System.out.println("this is overloaded method 1");
        return a+b;
    }
    static int add(int x,int y,int z){
        System.out.println("this is overloaded method 2");
        return x+y+z;
    }
    static int add(int a,int b,int c,int d){
        System.out.println("this is overloaded method 3");
        return a+b+c+d;
    }
    static double add(double a,double b){
        System.out.println("this is overloaded method 4");
        return a+b;
    }
}
