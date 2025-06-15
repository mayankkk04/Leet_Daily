class Pair{
    int first;
    int second;
    int dist;
    Pair(int first, int second, int dist){
        this.first = first;
        this.second = second;
        this.dist = dist;
    }
}
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] vis = new int[m][n];
        int[][] dist = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n ; j++){
                if(isWater[i][j] == 1){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 1;
                }
                else vis[i][j] = 0;
            }
        }
        int delrow[] = {-1,0,1,0};
        int delclm[] = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.first;
            int clm = curr.second;
            int steps = curr.dist;
            dist[row][clm] = steps;
            for(int i = 0 ; i < 4 ; i++){
                int nrow = row + delrow[i];
                int nclm = clm + delclm[i];
                if(nrow >= 0 && nrow < m && nclm >= 0 && nclm < n && vis[nrow][nclm] == 0){
                    vis[nrow][nclm] = 1;
                    q.add(new Pair(nrow,nclm,steps+1));
                }
            }
        }
        return dist;
    }
}