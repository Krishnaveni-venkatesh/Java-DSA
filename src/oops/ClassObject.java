package oops;

public class ClassObject {
    public static void main(String[] args){
        //create a class
        //for every single student

        class student{
            int rno;
            String name;
            float marks;
        }
        student s1=new student();
        s1.rno=14;
        s1.name="krish";
        s1.marks=98;

        System.out.println(s1.rno + " "+s1.name +" "+ s1.marks);
    }
}
