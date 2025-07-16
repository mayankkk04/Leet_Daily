class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] lastseen = new int[3];
        Arrays.fill(lastseen,-1);
        int cnt = 0;
        for(int i = 0 ; i < n ; i++){
            lastseen[s.charAt(i) - 'a'] = i;
            if(lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] != -1){
                int minIndex = Integer.MAX_VALUE;
                for(int j = 0; j < 3; j++){
                    minIndex = Math.min(minIndex, lastseen[j]);
                }
            cnt += (minIndex + 1);
            }
        }
        return cnt;
    }
}