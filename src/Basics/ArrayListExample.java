package Basics;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("mango");
        list.add(1, "Blueberry");

        System.out.println(list.contains("mango"));
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("Blueberry"));
        System.out.println(list.size());
    for(int i=0;i< list.size();i++){
        System.out.println(list .get(i));
    }


    }

}
