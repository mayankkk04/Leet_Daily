class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ArrayList<Integer> component = new ArrayList<>();
                dfs(i, visited, adj, component);

                int nodes = component.size();
                int totalEdges = 0;
                for (int node : component) {
                    totalEdges += adj.get(node).size();
                }
                totalEdges /= 2; // Each edge is counted twice

                if (totalEdges == nodes * (nodes - 1) / 2) {
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> component) {
        visited[node] = true;
        component.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj, component);
            }
        }
    }
}
