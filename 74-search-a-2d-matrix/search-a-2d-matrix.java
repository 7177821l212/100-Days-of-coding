class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Brute force solution [TC:n2]!!
        int row = matrix.length;
        int colm = matrix[0].length;
        for(int  i = 0; i < row; i++)
        {    
            for(int j = 0; j < colm; j++){
                if(matrix[i][j] == target)
                return true;
            }
        }
        return false;
    }
}
