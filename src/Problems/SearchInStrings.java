package Problems;

public class SearchInStrings {
    public static void main(String[] args){
        String str="krishnaveni";
        char target='u';
        boolean result=search(str,target);
        System.out.println(result);
    }
    static boolean search(String str,char target) {
        if (str.length() == 0) {
            return false;

        }
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
