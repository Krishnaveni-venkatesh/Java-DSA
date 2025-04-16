package Problems;

public class ToLowerCase {
    public String toLowerCase(String s){
        char[]c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>=65 && c[i]<=90){ //using ascii values
                c[i]=(char) (c[i]+32);
            }
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        ToLowerCase obj = new ToLowerCase();
        String result = obj.toLowerCase("Hello");
        System.out.println(result);
    }

}
