package Basics;

public class StringMethods {
    public static void main(String[] args) {
            String str = "Hello World";
            System.out.println("Length: " + str.length());          // Get length of string
            System.out.println("Char at index 1: " + str.charAt(1)); // Get character at index
            System.out.println("Substring: " + str.substring(0, 5)); // Extract substring
            System.out.println("Uppercase: " + str.toUpperCase());   // Convert to uppercase
            System.out.println("Lowercase: " + str.toLowerCase());   // Convert to lowercase
            System.out.println("Contains 'World': " + str.contains("World")); // Check substring
            System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // Replace substring
            System.out.println("Trim: '" + "  Hello  ".trim() + "'"); // Trim spaces
            System.out.println("Split by space: " + java.util.Arrays.toString(str.split(" "))); // Split string
        }
    }


