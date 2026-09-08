import java.util.*;

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int[] maxArray = Arrays.copyOfRange(nums, 0, i + 1);
            int[] minArray = Arrays.copyOfRange(nums, i, nums.length);

            var max = findMax(maxArray);
            var min = findMin(minArray);

            if (max - min <= k) {
                return i;
            }
        }

        return -1;
    }

    private int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
