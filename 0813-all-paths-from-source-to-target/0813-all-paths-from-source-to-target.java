class Solution {
    static void dfs(int u, boolean[] visited, int[][] graph, List<Integer> path, List<List<Integer>> ans){
        visited[u]=true;
        path.add(u);
        if(u==graph.length-1) {ans.add(new ArrayList<>(path));}
        for(int v: graph[u]){
            if(!visited[v]){
                dfs(v, visited, graph, path, ans);
            }
        }
        visited[u]=false;
        path.remove(path.size()-1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> ans= new ArrayList<> ();
        List<Integer> path= new ArrayList<>();
        boolean[] visited= new boolean[n];
        dfs(0, visited, graph, path, ans);
        return ans;
    }
}