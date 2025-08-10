package Problems;

public class SearchInRange {
    public static void main(String[]args){
        int [] arr={23,45,6,7,8,9,0};
        int target=7;
        int result=searchinIndex(arr,target,2,4);
        System.out.println(result);
    }
    public static int  searchinIndex(int []arr,int target,int start,int end){
        if(arr.length==0){
            return -1;

        }

        for(int i=start;i<=end;i++){
            int element =arr[i];
            if(element ==target){
                return i;
            }

        }
        return -1;
    }





}
