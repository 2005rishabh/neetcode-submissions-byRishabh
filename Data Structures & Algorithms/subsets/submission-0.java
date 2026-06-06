class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        fun(nums, 0, ll, new ArrayList<>());
        return ll;
    }

    public void fun(int[] nums, int i, List<List<Integer>> result, List<Integer> currentSubset) {
        if (i == nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        
        fun(nums, i + 1, result, currentSubset);

        currentSubset.add(nums[i]);
        fun(nums,i + 1, result, currentSubset);

        currentSubset.remove(currentSubset.size() - 1);
    }
}
