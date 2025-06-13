package Basics;
public class Stringbuilder {
        public static void main(String[] args) {
            StringBuilder name = new StringBuilder("krish");
            name.append(" krishna");
            System.out.println(name.charAt(0));
            name.setCharAt(0,'h');
            name.insert(2,"k");
            name.delete(5, 6);
            name.replace(6, 11, "Java");            
            name.reverse();
            System.out.println(name);
        }
    }
