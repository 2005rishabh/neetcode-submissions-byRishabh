class Solution {
    int c = 0;
    public int countSubstrings(String s) {
        for(int i = 0; i < s.length(); i++) {
            dfs(i, i, "", s);
        }
        return c;
    }

    void dfs(int i, int j, String res, String s) {
        if(j >= s.length()) return;
        res += s.charAt(j);
        if(isP(res, i-i, j-i)) c++;
        dfs(i, j+1, res, s);


    }

    boolean isP(String s, int i, int j) {
        if(i == j) return true;
        while(i <= j) {
            if(s.charAt(i++) != s.charAt(j--)) return false;


        }
        return true;

    }
}
