class Solution {
    public int[] twoSum(int[] nums, int target) {
        //lets update 0
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff)) {
                return new int[] { hashMap.get(diff), i };
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }
}
