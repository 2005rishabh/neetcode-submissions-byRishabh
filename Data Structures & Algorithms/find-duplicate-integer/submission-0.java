class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 1) return 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) return nums[i];
        }
        return 0;
    }
}
