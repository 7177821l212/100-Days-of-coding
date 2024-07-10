class Solution {
    public int uniquePaths(int m, int n) {
        int above_row [] = new int[n];
        Arrays.fill(above_row,1);
        for(int row = 1; row < m; row++)
        {
            int current_row [] = new int[n];
            Arrays.fill(current_row,1);
            for(int col = 1; col < n; col++)
            {
                current_row[col] = current_row[col - 1] + above_row[col];
            }
            above_row = current_row;
        }
        return above_row[n - 1];
    }
}