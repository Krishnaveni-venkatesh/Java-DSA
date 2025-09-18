package Problems;

import java.util.ArrayList;

public class RemovingVowels {

        public static String removeVowel(String S) {
            String vowels = "aeiou";
            ArrayList<Character> result = new ArrayList<>();

            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);

                if (vowels.indexOf(ch) != -1) {
                    boolean prevIsVowel = (i > 0 && vowels.indexOf(S.charAt(i - 1)) != -1);
                    boolean nextIsVowel = (i < S.length() - 1 && vowels.indexOf(S.charAt(i + 1)) != -1);

                    if (!prevIsVowel && !nextIsVowel) {
                        continue;
                    }
                }

                result.add(ch);
            }

            StringBuilder finalStr = new StringBuilder();
            for (char c : result) {
                finalStr.append(c);
            }
            return finalStr.toString();
        }

        public static void main(String[] args) {

            String S = "krishnaveni";
            String result = removeVowel(S);
            System.out.println(result);
        }
    }
