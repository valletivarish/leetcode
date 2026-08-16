class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (counter.containsKey(k)) {
                return new int[] { counter.get(k), i };
            } else {
                counter.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
