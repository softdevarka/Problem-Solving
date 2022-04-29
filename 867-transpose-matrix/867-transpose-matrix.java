class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix[0].length;
        int c = matrix.length;
        int temp [][] = new int [r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                temp[i][j] = matrix[j][i];
            }
        }
        return temp;
    }
}
    