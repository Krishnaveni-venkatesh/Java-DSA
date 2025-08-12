package Problems;

public class FindingEvenNoOfDigits {
    public static int findNumbers(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }
    static int digits2(int n){
        if(n<0){
            n=n*-1;
        }
        return (int)(Math.log10(n))+1;
    }
    public static boolean even(int num){
        int numberofdigits=digits(num);
        return numberofdigits %2==0;
    }
    public static int digits(int n){

        if(n==0){
            return 1;
        }
        int count1=0;
        while (n > 0) {
            count1 ++;

            n=n/10;
        }
        return count1;
    }
    public static void main(String[] args){
        int [] nums={123,56,1764,9,89};
        System.out.println(findNumbers(nums));
    }
}
