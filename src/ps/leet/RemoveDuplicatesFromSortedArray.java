package ps.leet;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4,4}));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 0;

        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] == nums[i - 1]) {
                nums[i - 1] = 1000;
                for (int j = i - 1; j < nums.length - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int num : nums) {
            if (num != 1000) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
