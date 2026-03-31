import java.util.*;

class PartitionGrid {

    public static boolean canPartitionGrid(int[][] grid) {

        int m = grid.length, n = grid[0].length;

        long total = 0;

        for (int[] row : grid)
            for (int x : row)
                total += x;

        if ((total & 1) == 1)
            return false;

        long target = total / 2, sum = 0;

        // Horizontal cut check
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++)
                sum += grid[i][j];

            if (sum == target)
                return true;
        }

        sum = 0;

        // Vertical cut check
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++)
                sum += grid[i][j];

            if (sum == target)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = in.nextInt();

        boolean result = canPartitionGrid(grid);

        System.out.println(result);

        in.close();
    }
}