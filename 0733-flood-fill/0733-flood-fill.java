class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int[][] ans = image;
       int iniColor = image[sr][sc];
       int[] delRow = {-1,0,1,0};
       int[] delClm = {0,1,0,-1};
       dfs(sr,sc,ans,image, color,delRow,delClm, iniColor);
       return ans;
    }
    private void dfs(int row, int clm, int[][] ans, int[][] image, int color, int[] delRow, int[] delClm, int iniColor){
        ans[row][clm] = color;
        int m = image.length;
        int n = image[0].length;
        for(int i = 0 ; i < 4 ; i++){
            int nrow = row + delRow[i];
            int nclm = clm + delClm[i];
            if(nrow >= 0 && nrow < m && nclm >= 0 && nclm <n && image[nrow][nclm] == iniColor && ans[nrow][nclm] != color){
                dfs(nrow, nclm, ans,image, color, delRow, delClm, iniColor);
            }
        }
        
        
    }
}