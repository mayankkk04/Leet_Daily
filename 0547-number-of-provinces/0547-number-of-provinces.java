class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int m = isConnected.length;
        int n = isConnected[0].length;
        for(int i=0;i<m;i++){
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                }
            }
        }
        int V = adj.size();
        boolean[] visited = new boolean[V];
        int count = 0;
        for(int i = 0 ; i < V; i++){
            if(!visited[i]){
                dfs(i,visited,adj);
                count++;
            }
        }
        return count;
    }
    private static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[node] = true;
        for (int neighbour : adj.get(node)) {
        if (!visited[neighbour]) {
            dfs(neighbour, visited, adj);
        }
    }
    }
}
