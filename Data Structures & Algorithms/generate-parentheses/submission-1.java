class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, String currentString, int open, int close, int max) {
        // Base case: if the string length is 2*n, we've formed a valid combination
        if (currentString.length() == max * 2) {
            res.add(currentString);
            return;
        }

        // Rule 1: We can always add an opening bracket if we haven't reached 'n'
        if (open < max) {
            backtrack(res, currentString + "(", open + 1, close, max);
        }
        
        // Rule 2: We can only add a closing bracket if it pairs with an unmatched opening bracket
        if (close < open) {
            backtrack(res, currentString + ")", open, close + 1, max);
        }
    }
}