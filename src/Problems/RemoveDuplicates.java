package Problems;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int index = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
            int length = removeDuplicates(nums);
            System.out.println("New length: " + length);
            System.out.print("Modified array: ");
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }


