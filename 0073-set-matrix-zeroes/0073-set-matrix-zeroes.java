class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length; //row
        int m = matrix[0].length; //clm
        int[] row = new int[n];
        int[] clm = new int[m];
        // int[][] temp = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    clm[j] = 1;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(row[i] == 1 || clm[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}