package Problems;

public class SmallestCharacter {
    static char letters (char[] arr,char target ){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }


        }
        return arr[start % arr.length];
    }
    public static void main(String[]args){
        char[]arr={'c','f','g','h','i'};
        char target='j';
        System.out.println(letters(arr,target));
    }
}
