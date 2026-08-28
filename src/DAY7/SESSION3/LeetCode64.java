package DAY7.SESSION3;

public class LeetCode64 {

        public int minPathSum(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            int[] current = new int[m];
            current[0] = grid[0][0];


            for (int i = 1; i < m; i++)
                current[i] = current[i - 1] + grid[i][0];


            for (int j = 1; j < n; j++) {
                current[0] += grid[0][j];
                for (int i = 1; i < m; i++)
                    current[i] = Math.min(current[i - 1], current[i]) + grid[i][j];
            }

            return current[m - 1];
        }
    }

