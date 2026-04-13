class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int r[] = {-1, -1};
        for(int i = 0 ; i < nums.length; i++) {
            if(map.containsKey(t - nums[i])) {
                r[0] = map.get(t - nums[i]);
                r[1] = i;
            }
            map.put(nums[i], i);
        }
        return r;
    }
}
