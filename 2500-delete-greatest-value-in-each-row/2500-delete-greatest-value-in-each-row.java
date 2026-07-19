import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int answer = 0;

        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }

        for (int j = 0; j < n; j++) {
            int maxInColumn = 0;
            
            for (int i = 0; i < m; i++) {
                maxInColumn = Math.max(maxInColumn, grid[i][j]);
            }
            
            answer += maxInColumn;
        }

        return answer;
    }
}