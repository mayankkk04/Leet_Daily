// class Solution {
//     public int numEnclaves(int[][] grid) {
        
//     }
// }
class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[m][n];
        for(int i = 0 ; i < m ;i++){
            if(grid[i][0] == 1){
                vis[i][0] = 1;
                q.add(new Pair(i,0));
            }
            if(grid[i][n-1] == 1){
                vis[i][n-1] = 1;
                q.add(new Pair(i,n-1));
            }
        }
        for(int i = 0 ; i < n ;i++){
            if(grid[0][i] == 1){
                vis[0][i] = 1;
                q.add(new Pair(0,i));
            }
            if(grid[m-1][i] == 1){
                vis[m-1][i] = 1;
                q.add(new Pair(m-1,i));
            }
        }
        int delrow[] = {-1,0,1,0};
        int delclm[] = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.first;
            int clm = curr.second;
            for(int i = 0 ; i < 4 ; i++){
                int nrow = row + delrow[i];
                int nclm = clm + delclm[i];
                if(nrow >= 0 && nrow < m && nclm >= 0 && nclm < n && vis[nrow][nclm] == 0 && grid[nrow][nclm] == 1){
                    vis[nrow][nclm] = 1;
                    q.add(new Pair(nrow,nclm));
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && vis[i][j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}