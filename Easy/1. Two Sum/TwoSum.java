class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create hashmap
        Map<Integer,Integer> numsMap = new HashMap<>();

        // Put values into hashmap
        for(int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i],i);
        }

        // Check for 2 values that add up to target
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(numsMap.containsKey(difference) && numsMap.get(difference) != i) {
                return new int[]{i,numsMap.get(difference)};
            }
        }
        return new int[] {};
    }
}
