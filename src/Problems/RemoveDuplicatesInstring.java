package Problems;

import java.util.HashSet;

public class RemoveDuplicatesInstring {
    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "kkrisshn";
        System.out.println(removeDuplicates(str));
    }
}
