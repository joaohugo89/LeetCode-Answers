class Solution {
    public int[][] generateMatrix(int N) {
        int[][] matrix = new int[N][N];
        
        int top = 0;
        int bottom = N - 1;
        int left = 0;
        int right = N - 1;
        
        int number = 1;

        while (top <= bottom && left <= right) {
            
            for (int c = left; c <= right; c++) {
                matrix[top][c] = number++;
            }
            top++;

            for (int r = top; r <= bottom; r++) {
                matrix[r][right] = number++;
            }
            right--;

            if (top > bottom || left > right) break;
            
            for (int c = right; c >= left; c--) {
                matrix[bottom][c] = number++;
            }
            bottom--;

            for (int r = bottom; r >= top; r--) {
                matrix[r][left] = number++;
            }
            left++;
        }
        return matrix;
    }
}