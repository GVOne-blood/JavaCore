import java.util.Arrays;

public class L2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] result = new int [2];
        int n = grid.length;
        int [] temp = new int [n*n];

        for (int i = 0;i <n ; i++)
            for(int j = 0; j < n; j++) temp[grid[i][j]]++;

        for (int i = 0;i <= n*n ;i++){
            if (temp[i] == 2) result[0] = i;
            if (temp[i] == 0) result[1] = i;
        }
        return result;
    }
}
