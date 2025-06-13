class Pair{
    int row;
    int clm;
    int time;
    Pair(int _row, int _clm, int _time){
        this.row = _row;
        this.clm = _clm;
        this.time = _time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int cntfresh = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i =0 ; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }else{
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1) cntfresh++;
            }
        }
        int time = 0;
        int drow[] = {-1,0,1,0};
        int dclm[] = {0,1,0,-1};
        int cnt = 0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().clm;
            int t = q.peek().time;
            time = Math.max(time,t);
            q.remove();
            for(int i = 0 ; i < 4 ; i++){
            int nrow = r + drow[i];
            int nclm = c + dclm[i];
            if(nrow >= 0 && nrow < m && nclm >= 0 && nclm < n && vis[nrow][nclm] == 0 && grid[nrow][nclm] == 1){
                q.add(new Pair(nrow,nclm,t+1));
                vis[nrow][nclm] =2;
                cnt++;
                }
            }
            
        }
        if(cnt != cntfresh) return -1;
        return time;
    }
}