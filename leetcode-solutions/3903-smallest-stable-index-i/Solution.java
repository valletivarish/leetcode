class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minFrom = new int[n];
        minFrom[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minFrom[i] = Math.min(minFrom[i + 1], nums[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            int min = minFrom[i];
            if (max - min <= k) {
                return i;
            }
        }
        return -1;
    }
}
