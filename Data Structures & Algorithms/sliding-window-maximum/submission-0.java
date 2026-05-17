class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int res[] = new int[n- k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for(int  i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        int max = pq.peek();
        res[0] = max;
        for(int i = k; i < n; i++) {
            if(pq.contains(nums[i-k])){
                pq.remove(nums[i-k]);
            }
            pq.add(nums[i]);
            res[i-k+1] = pq.peek();
        }
        return res;
    }
}
