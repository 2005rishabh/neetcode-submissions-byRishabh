class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ll = new ArrayList<>();
        fun(0, 0, nums, target, ll, new ArrayList<>());
        return ll;
    }

    public void fun(
        int i, int sum, int[] nums, int t, List<List<Integer>> result, List<Integer> curr) {
        if (sum == t) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (sum > t || i >= nums.length) {
            return;
        }
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            curr.add(nums[j]);
            
            fun(j + 1, sum + nums[j], nums, t, result, curr);
            
            curr.remove(curr.size() - 1);
        }
    }
}
