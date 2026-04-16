class Solution {
    public int[] twoSum(int[] arr, int t) {
        int[] result = {-1,-1};
        int l = 0;
        int r = arr.length-1;
        while(l < r) {
            if(arr[l] + arr[r] == t) {
                result[0] = l+1;
                result[1] = r+1;
                return result;
            }
            else if(arr[l]+ arr[r] > t) {
                r--;
            }
            else {
                l++;
            }
        }
        return result;
    }
}
