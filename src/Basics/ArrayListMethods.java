package Basics;
import java.util.ArrayList;

public class ArrayListMethods {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();

            list.add("Apple");   // Add element
            list.add("Banana");
            list.add("Orange");

            System.out.println("List: " + list);
            list.add(1, "Mango"); // Insert at index
            System.out.println("After adding Mango: " + list);

            list.remove("Banana"); // Remove element
            System.out.println("After removing Banana: " + list);

            System.out.println("Contains Apple? " + list.contains("Apple")); // Check presence

            System.out.println("Size of list: " + list.size()); // Get size

            list.set(0, "Grapes"); // Modify element
            System.out.println("After modifying: " + list);

            for (String fruit : list) {
                System.out.println("Fruit: " + fruit); // Loop through elements
            }

            list.clear(); // Clear all elements
            System.out.println("List after clear: " + list);
        }
    }


