//input:"banana apple banana cherry"
//checking if the substring exists in it or not and if exists it should give its index from where the substring starts


package Problems;

public class FirstOccuranceofString {
    public static int findSubstring(String text, String substring) {
        int textLength = text.length();
        int substringLength = substring.length();
        for (int i = 0; i < textLength - substringLength + 1; i++) {
            String part = text.substring(i, i + substringLength);
            if (part.equals(substring)) {
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        String text = "banana apple banana cherry";
        String substring = "banana";

        int index = findSubstring(text, substring);

        if (index != -1) {
            System.out.println("Substring found at index:" + index);
        } else {
            System.out.println("Substring not found");
        }
    }
}


