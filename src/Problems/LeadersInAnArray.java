package Problems;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static ArrayList<Integer> leadersInArray(int[] arr){
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
                if(j == arr.length){
                    result.add(arr[i]);
            }

        }
        return result;
    }
    public static void main(String[]args){
        int[] arr={16,19,4,3,7,5,2};
        System.out.println(leadersInArray(arr));
    }
}
