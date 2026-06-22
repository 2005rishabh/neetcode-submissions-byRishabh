class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] isVis = new boolean[n][m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !isVis[i][j]) {
                    int area = dfs(i, j, grid, isVis, n, m);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    public int dfs(int i, int j, int[][] grid, boolean[][] isVis, int n, int m) {
        // Fixed: Checked against integer 0, not character '0'
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0 || isVis[i][j]) {
            return 0;
        }
        
        // Mark as visited BEFORE branching out
        isVis[i][j] = true;

        // Fixed: Return 1 (this cell) + the area of all connected cells
        return 1 + dfs(i + 1, j, grid, isVis, n, m) 
                 + dfs(i - 1, j, grid, isVis, n, m) 
                 + dfs(i, j + 1, grid, isVis, n, m) 
                 + dfs(i, j - 1, grid, isVis, n, m);
    }
}