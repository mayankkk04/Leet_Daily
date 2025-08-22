class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length; //rows
        int n = grid[0].length; //clms

        int minRow = m;
        int maxRow = -1;
        int minClm = n;
        int maxClm = -1;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 1){
                    minRow = Math.min(minRow,i);
                    maxRow = Math.max(maxRow,i);
                    minClm = Math.min(minClm,j);
                    maxClm = Math.max(maxClm,j);
                }
            }
        }
        int l = maxRow - minRow + 1;
        int w = maxClm - minClm + 1;
        return l*w;
    }
}