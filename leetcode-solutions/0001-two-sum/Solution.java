class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(nums[i])) {
                return new int[] { hashMap.get(nums[i]), i };
            }
            hashMap.put(diff, i);
        }
        return new int[] { 0, 0 };
    }
}
