/*n=8;
arr=[1,2,3,4,5,6,3,2,3,2]
k=4
n/k=2
output=2
 */
package Problems;
import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    public static int countOccurences(int[] arr,int n,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.putIfAbsent(arr[i],0);
            hm.put(arr[i],hm.get(arr[i])+1);
        }
        int count =0;
        for(Map.Entry<Integer,Integer> x:hm.entrySet()){
            if(x.getValue()>n/k){
                count++;
            }
        }
     return count;
    }
    public static void main(String[] args){
        int[] arr={0,1,2,2,3,2,3,3};
        int n=8;
        int k=4;
        System.out.println(countOccurences(arr,n,k));
    }
}
