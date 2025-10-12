/* haystack = "sadbutsad"  needle = "sad"
checking first occurance of needle in haystack
if present return its first char index,or else return -1
 */
package Problems;

public class IndexofFirstOccuranceword {
    public static int str(String haystack,String needle){
        for(int i = 0; i<haystack.length()-needle.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,needle.length() + i).equals(needle))
                {
                    return i;
                }

            }
        }
       return -1;
    }
    public static void main(String[] args){
        String haystack = "sadbutsad";
        String needle = "but";
        System.out.println(str(haystack,needle));
    }

}
