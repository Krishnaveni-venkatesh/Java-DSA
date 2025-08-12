package Problems;
import java.util.ArrayList;
import java.util.Arrays;
//''to day is tuesday''  return the word with longest length
public class Main {
    public static String longestLenghth(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int length = 0;
        String result = " ";
        for (String word : words) {
            if (word.length() > result.length()) {
                result = word;

            }
        }
    return result;


    }
    //{1,5,0,6,0,4}
    //output={1,5,6,4,0,0}
    public static ArrayList<Integer> moveZeros (int[] arr){
        ArrayList<Integer> result=new ArrayList<>();
        int zerocount=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] > 0) {
                result.add( arr[i]);
            }
            else{
                zerocount++;

            }

        }
        while(zerocount>0){
            result.add(0);
            zerocount--;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println( longestLenghth("to day istuesday"));
        String a = "to" ;
        String b = "tuesday" ;
        //int result  = Math.max(a.length() ,b.length());
        //System.out.println(result);
        int[] arr={3,0,9,8,0,6};
        ArrayList<Integer> result=moveZeros(arr);
        System.out.println(result);

    }




}
