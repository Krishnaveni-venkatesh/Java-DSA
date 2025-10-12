package Problems;
import java.util.ArrayList;

public class LengthOfLongestSubstring {
    public static String longestSubstring(String str){
        int start = 0;
        int end = 0;
        int max_length = 0;
        int max_start = 0;
        ArrayList<Character> list = new ArrayList<Character>();

        while (end < str.length()) {
            if (!list.contains(str.charAt(end))) {
                list.add(str.charAt(end));
                end++;
                if (list.size() > max_length) {
                    max_length = list.size();
                    max_start = start;
                }
            } else {
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        return str.substring(max_start, max_start + max_length);
    }

    public static void main(String[] args){
        String str = "abcabcbb";
        System.out.println(longestSubstring(str));
    }
}
