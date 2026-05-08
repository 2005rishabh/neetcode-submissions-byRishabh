class Solution {
    public boolean isValid(String s) {
        Deque<Character> d = new ArrayDeque<>();
        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') d.push(ch);
            else {
                if(d.isEmpty()) return false;
                char top = d.pop();
                if(ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return d.isEmpty();
    }
}
