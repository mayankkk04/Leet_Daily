class Solution {
    private boolean checkBipartiteBFS(int start, ArrayList<ArrayList<Integer>> adj, int[] vis, int V){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int it : adj.get(node)){
                if(vis[it] == -1){
                    vis[it] = 1 - vis[node];
                    q.add(it);
                }
                else if(vis[it] == vis[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        // int n = graph[0].length;
        int[] vis = new int[V];
        for(int i = 0 ; i < V ; i++){
            vis[i] = -1;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < V; i++) {
            for (int neighbor : graph[i]) {
                adj.get(i).add(neighbor);
            }
        }
        for (int i = 0; i < V; i++) {
            if (vis[i] == -1) {
                if (!checkBipartiteBFS(i, adj, vis, V)) {
                    return false;
                }
            }
        }
        return true;
    }
}