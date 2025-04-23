package Problems;
//System.out.println(containsNumber(new int[]{1, 2, 3, 4}, 3)); // true
//        System.out.println(containsNumber(new int[]{1, 2, 3, 4}, 9)); // false

public class Mainn {
    public static boolean  checkingElement(int [] arr,int n){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(checkingElement(arr,5));


    }
}

