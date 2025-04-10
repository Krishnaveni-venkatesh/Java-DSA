package Problems;

public class LeadersOfArray {
    public static void main(String[] args){
        int array[]={16,34,63,89,12};
        int size=array.length;
        for(int i=0;i<size;i++){
            int j;
            for(j = i + 1; j<size; j++){
                if(array[i]<=array[j])
                    break;


                }
                if(j==size)
                    System.out.println(array[i]);


            }
        }
    }


