package oops;

public class Constructors {
    String name;
    int age;
    double weight;
    Constructors(String name,int age,double weight){
        this.name =name;
        this.age =age;
        this.weight=weight;

    }
    public static void main(String[] args){
        Constructors cons=new Constructors("krish",24,45);
        System.out.println(cons.name);
    }
}
