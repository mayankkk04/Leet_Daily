class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int cnt = 0;
        for(int i = 0 ; i < n-1 ; i++){
            if(word.charAt(i) == word.charAt(i+1)) cnt++;
        }
        return cnt+1;
    }
}