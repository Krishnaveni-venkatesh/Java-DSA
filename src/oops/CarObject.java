package oops;

public class CarObject {
    //Attributes of car
    String make="Chevrolet";
    String color="white";
    String model="corvette";
    int year=2025;
    double price=50000.00;

    //Methods
    void drive(){
        System.out.println("you drive the car");
    }
    void brake(){
        System.out.println("You step on the brake");
    }



    public static void main(String[] args){
        //creation of object in this ,now it contains both attributes and methods
        CarObject myCar1=new CarObject();

        //creating another object
        CarObject myCar2=new CarObject();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);


        //accessing the attributes
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        //calling the methods
        myCar1.drive();

    }
}
