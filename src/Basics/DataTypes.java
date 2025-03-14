package Basics;

public class DataTypes {



    public static void main(String[] args) {

        byte age=30;
       final int number=123567589;
        long number1=12356758900L;
        float pi=3.14F;
        boolean isAdult=true;
        System.out.println(isAdult);
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=12;
        arr[0] =8;

        String[] names={"Krishnaveni"};
        int[] nums ={1,2,3,4,5};

//        for(int index = nums.length-1;index>=0;index--){
//            System.out.println(nums[index]);
//        }
        int start = 0;
        int end = nums.length - 1;


        while(start<=end){

            System.out.println(nums[start]);
            System.out.println(nums[end]);
            start++;
            end--;
        }


    }
}
