class Solution {
    public int removeElement(int[] nums, int val) {
        int numRemoved = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                numRemoved += 1;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                temp = nums[i];
                for(int j = 0; j < nums.length; j++) {
                    if(nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = temp;
                        temp = nums[j];
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < nums.length/2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
        return nums.length - numRemoved;
    }
}
