package Problems;
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>0;i--){
            if(str.charAt(i)!=' '){
                count ++;
            }
            else{
                break;
            }
        }

      return count;
    }
    public static void main(String[] args){
        String s="my name is krishnaveni";
        System.out.println(lengthOfLastWord(s));
    }
}
