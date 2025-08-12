//input:{{2,3,4},{3,4,5}}
//output :add both of the rows in array,and return which row as the maximum value
package Problems;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}};
        MaximumWealth obj1 = new MaximumWealth();
        System.out.println(obj1.maximumWealth(arr));
    }
}
