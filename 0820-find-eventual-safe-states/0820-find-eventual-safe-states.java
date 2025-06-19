class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        List<ArrayList<Integer>> list = new ArrayList<>();
        int[] indegree = new int[V];
        for(int i = 0 ; i < V ; i++){
            list.add(new ArrayList<>());
        }
        for (int u = 0; u < V; u++) {
            for (int v : graph[u]) {
                list.get(v).add(u);
                indegree[u]++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < V ; i++){
            if(indegree[i] == 0) q.add(i);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int it : list.get(node)){
                indegree[it]--;
                if(indegree[it] == 0) q.add(it);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}