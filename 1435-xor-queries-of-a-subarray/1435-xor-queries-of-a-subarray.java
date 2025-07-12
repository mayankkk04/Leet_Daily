class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] cumXOR = new int[n];
        cumXOR[0] = arr[0];
        for(int i = 1 ; i < n ; i++){
            cumXOR[i] = cumXOR[i-1]^arr[i];
        }
        List<Integer> res = new ArrayList<>();
        for(int[] query : queries){
            int l = query[0];
            int r = query[1];
            int xor = cumXOR[r]^(l == 0 ? 0 : cumXOR[l-1]);
            res.add(xor);
        }
        int[] solution = new int[res.size()];
        for(int i = 0 ; i < res.size() ; i++){
            solution[i] = res.get(i);
        }
        return solution;
    }
}