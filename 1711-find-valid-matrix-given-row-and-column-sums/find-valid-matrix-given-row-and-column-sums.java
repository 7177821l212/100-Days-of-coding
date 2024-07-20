class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row = rowSum.length;
        int col = colSum.length;
        int result[][] = new int [row][col];
        int i = 0,j = 0;
        while(i < row && j < col)
        {
            int value = Math.min(rowSum[i],colSum[j]);
            result[i][j] = value;
            rowSum[i]-=value;
            colSum[j]-=value;
            if(rowSum[i] == 0)
            {
                i++;
            }
            if(colSum[j] == 0)
            {
                j++;
            }
        }
        return result;
    }
}