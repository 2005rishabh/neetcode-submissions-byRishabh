class Solution {
    String longest = "";

    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++) { 
            dfs(i, s, "");
        }
        return longest;
    }

    void dfs(int i, String s, String res) {
        if(i == s.length()) return; 
        
        res += s.charAt(i);
        
        if(isPalindrome(res) && res.length() > longest.length()) {
            longest = res;
        }

        dfs(i + 1, s, res);
    }

    public boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while(l < r) {
            if(str.charAt(l++) != str.charAt(r--)) return false;
        }
        return true;
    }
}