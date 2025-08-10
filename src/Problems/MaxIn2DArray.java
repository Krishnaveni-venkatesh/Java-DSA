package Problems;
import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{5, 7, 89, 90}, {54, 32, 56, 9}, {5, 8, 9, 10}};
        System.out.println(Arrays.toString(search(arr)));
    }

    public static int[] search(int[][] arr) {
        int max = arr[0][0];//or int max=Integer.MIN_VALUE
        int rowIndex = 0;
        int colIndex = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }
        return new int[]{rowIndex, colIndex};//or return max

    }
}
