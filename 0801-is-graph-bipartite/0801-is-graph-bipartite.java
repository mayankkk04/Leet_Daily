class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        Arrays.fill(color, -1);

        for(int i = 0; i < n; i++) {

            if(color[i] == -1 && !dfs(i, graph, color, 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int currNode, int[][] graph, int[] color, int currColor) {
        color[currNode] = currColor;
        for(int nextNode : graph[currNode]) {
            
            
            if(color[nextNode] == -1) { 
                int nextColor = (currColor == 1) ? 2 : 1;
                if(!dfs(nextNode, graph, color, nextColor)) {
                    return false;
                }
            }
            else {
                if(color[currNode] == color[nextNode]) {
                    return false;
                }
            }
        }
        return true;
    }
}