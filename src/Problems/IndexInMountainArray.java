package Problems;

public class IndexInMountainArray {
    public int MountainArray(int[] arr){
        int i=0;
        //while(arr[i] < arr[i+1]){
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        IndexInMountainArray obj=new IndexInMountainArray();
        int[] mountainArr = {1, 3, 5, 7, 6, 4, 2};
        int peakIndex = obj.MountainArray(mountainArr);
        System.out.println(peakIndex);


    }
}
