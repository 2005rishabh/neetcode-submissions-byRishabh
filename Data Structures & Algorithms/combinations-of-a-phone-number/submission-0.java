class Solution {
    HashMap<Character, String> map;
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<String>();
        if(digits.length() == 0) return l;
        map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");   

        List<String> str = new ArrayList<>();

        dfs(0, "", digits, str);
        return str;
    }

    void dfs(int i, String s, String d, List<String> res) {
        if(i == d.length()) {
            res.add(s);
            return;
        }

        for(char c: map.get(d.charAt(i)).toCharArray()) {
            String temp = new String(s);
            temp += c;
            dfs(i+1, temp, d, res);
        }
    }
}
