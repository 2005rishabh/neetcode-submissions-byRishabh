class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] isVis = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !isVis[i][j]) {
                    count++;
                    dfs(i, j, grid, isVis, n, m);
                }
            }
        }

        return count;
    }

    public void dfs(int i, int j, char[][] grid, boolean[][] isVis, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0' || isVis[i][j]) {
            return;
        }

        isVis[i][j] = true;

        dfs(i + 1, j, grid, isVis, n, m);
        dfs(i - 1, j, grid, isVis, n, m);
        dfs(i, j + 1, grid, isVis, n, m);
        dfs(i, j - 1, grid, isVis, n, m);
    }
}