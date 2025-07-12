class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int m = queries.length;
        for(int i = 0 ; i < m ; i++){
                int xor = 0;
                int left = queries[i][0];
                int right = queries[i][1];
                for(int k = left ;  k <= right ; k++){
                    xor ^= arr[k];
                }
                ans.add(xor);
        }
        int[] res = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}