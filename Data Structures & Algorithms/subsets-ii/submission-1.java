class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        HashSet<List<Integer>> ll = new HashSet<>();
        fun(nums, 0, ll, new ArrayList<>());
        return new ArrayList<>(ll);
    }

    public void fun(int[] nums, int i, HashSet<List<Integer>> result, List<Integer> currentSubset) {
        if (i == nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }


        currentSubset.add(nums[i]);
        fun(nums, i + 1, result, currentSubset);

        currentSubset.remove(currentSubset.size() - 1);
        fun(nums, i + 1, result, currentSubset);

    }
}