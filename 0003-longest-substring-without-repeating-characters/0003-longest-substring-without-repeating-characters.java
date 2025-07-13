class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        // if(s.isEmpty() || ) return 1;
        int maxlen = 0;
        for(int i = 0 ; i < n ; i++){
            int[] hash = new int[255];
            int len = 0;
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if (hash[ch] == 1) break;
                hash[ch]++;
                len++;
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
}