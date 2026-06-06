class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        fun(0, 0, nums, target, ll, new ArrayList<>());
        return ll;
    }

    public void fun(int i, int sum, int[] nums, int t, List<List<Integer>> result, List<Integer> curr) {
        
        if(sum == t) {
            result.add(new ArrayList<>(curr));
            return;
        }   
        if(sum > t ||i >= nums.length) {
            return;
        }
        fun(i+1, sum, nums, t, result, curr);

        curr.add(nums[i]);
        fun(i, sum + nums[i], nums, t, result, curr);

        curr.remove(curr.size() - 1);
    }
}
