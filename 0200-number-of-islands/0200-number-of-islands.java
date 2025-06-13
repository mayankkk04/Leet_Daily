class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    private void bfs(int row, int clm, int[][] vis, char[][] grid){
        vis[row][clm] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row,clm));
        int n = grid.length;
        int m = grid[0].length;
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int ro = q.peek().first;
            int cl = q.peek().second;
            q.poll();
            for (int i = 0; i < 4; i++) {
                int nrow = ro + dRow[i];
                int nclm = cl + dCol[i];
                if (nrow >= 0 && nrow < n && nclm >= 0 && nclm < m &&
                    grid[nrow][nclm] == '1' && vis[nrow][nclm] == 0) {
                    vis[nrow][nclm] = 1;
                    q.add(new Pair(nrow, nclm));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        int[][] vis = new int[n][m];
        for(int row = 0; row < n ; row++){
            for(int clm = 0 ; clm < m ; clm++){
                if(vis[row][clm] == 0 && grid[row][clm] == '1'){
                    bfs(row,clm,vis,grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}