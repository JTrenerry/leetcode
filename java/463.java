class Solution {
    public int islandPerimeter(int[][] grid) {
        int val = 0;
        for (int i =0; i < grid.length; i++) {
            
            for (int j =0 ; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    val += hmm(grid, i, j);
                }
            }
        }
        return val;
    }

    public int hmm(int[][] grid, int i, int j) {
        int val = 0;
        if (i - 1 >= 0 && grid[i -1][j] != 1) {
            val++;
        } else if (i - 1 < 0) {
            val++;
        }
        if (i + 1 < grid.length && grid[i +1][j] != 1) {
            val++;
        } else if (i + 1 >= grid.length) {
            val++;
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] != 1) {
            val++;
        } else if (j + 1 >= grid[0].length) {
            val++;
        }
        if (j - 1 >= 0 && grid[i][j - 1] != 1) {
            val++;
        } else if (j -1 < 0) {
            val++;
        }
        return val;
    }
}
