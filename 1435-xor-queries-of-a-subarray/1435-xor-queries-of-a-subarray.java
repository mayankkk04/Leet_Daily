class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXor= new int[arr.length];
        prefixXor[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixXor[i]=prefixXor[i-1]^arr[i];
        }
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l==0){
                res[i]=prefixXor[r];
            }else{
                res[i]=prefixXor[r]^prefixXor[l-1];
            }
        }
        return res;
    }
}