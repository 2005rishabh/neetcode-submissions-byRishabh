class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // int maxP = nums[0]; 
        // for (int i = 0; i < nums.length; i++) {
        //     int currentProduct = 1;
            
        //     for (int j = i; j < nums.length; j++) {
        //         currentProduct *= nums[j];
        //         maxP = Math.max(maxP, currentProduct);
        //     }
        // }

        int maxP = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            maxP = Math.max(dfs(i, i, nums, 1), maxP);
        }
        return  maxP; 
    }

    int dfs(int i, int j, int[] nums, int p) {
        if(j >= nums.length) return Integer.MIN_VALUE;

        p *= nums[j];
        int max = dfs(i, j+1,nums, p);
        return Math.max(p, max);
    }
}