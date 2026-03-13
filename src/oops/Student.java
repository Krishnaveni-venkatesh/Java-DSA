package oops;
import java.util.Arrays;
//create a class
//for every single student
class Student1{
    int rno;
    String name ;
    float marks;

   void greeting(){
       System.out.println("hello iam "+this.name);


   }
    //we need a way to add the values of the above
    // properties object by object

    //we need one word to access every object
    //constructor
     Student1(){
         this.rno=77;
         this.name="krish";
         this.marks=99.5f;


    }
    void changeName(String newName){
       name=newName;
       System.out.println("my new name is :"+newName);
    }
}

public class Student {

    public static void main(String[] args){

     Student1 students=new Student1();

        System.out.println(students.name);
        System.out.println(students.rno);
        System.out.println(students.marks);
        students.greeting();
        students.changeName("krishnaveni");

    }
}
