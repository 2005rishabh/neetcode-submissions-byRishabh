class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // If we find the first letter, start the DFS
                if (board[i][j] == word.charAt(0)) {
                    // Pass the actual i and j coordinates
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // 1. Success Base Case: We have matched all characters in the word
        if (index == word.length()) {
            return true;
        }

        // 2. Failure Base Case: Out of bounds OR the current cell doesn't match
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // 3. Mark the current cell as visited to prevent reusing it
        char temp = board[i][j];
        board[i][j] = '*';

        // 4. Explore all 4 adjacent directions (Up, Down, Left, Right)
        boolean found = dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1);

        // 5. Backtrack: Restore the cell's original character so other paths can use it
        board[i][j] = temp;

        return found;
    }
}