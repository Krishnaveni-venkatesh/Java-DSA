package Problems;

public class BacktrackingRecurssion {
    public static int recurssion(int i,int n){
        if(i<1){
            return 0;
        }
        int result=recurssion(i-1,n);
        System.out.println(i);
       return result;
    }
    public static void main(String[] args){
        recurssion(5,5);
    }
}
