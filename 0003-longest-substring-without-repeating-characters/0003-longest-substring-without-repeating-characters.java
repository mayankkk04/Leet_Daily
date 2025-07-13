class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int len = 0;
        int l = 0;
        //int r = 0;
        for(int r = l ; r < n ; r++){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
                l = map.get(s.charAt(r))+1;
                len = r-l+1;
                maxlen = Math.max(maxlen,len);
                map.put(s.charAt(r),r);
            }else{
                len = r-l+1;
                map.put(s.charAt(r),r);
                maxlen = Math.max(maxlen,len);
            }    
        }
        return maxlen;
    }
}