import java.util.Arrays;

public class L2639 {
    public int isValid(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return Math.max(String.valueOf(min).length(), String.valueOf(max).length());
    }

    public int[] findColumnWidth(int[][] grid) {
        int columns = grid[0].length; // Get the number of columns
        int[] res = new int[columns];

        for (int j = 0; j < columns; j++) { // Iterate through columns
            int[] colArray = new int[grid.length];
            for (int i = 0; i < grid.length; i++) { // Collect each column's values
                colArray[i] = grid[i][j];
            }
            res[j] = isValid(colArray); // Calculate width for the column
        }
        return res;
    }
}
