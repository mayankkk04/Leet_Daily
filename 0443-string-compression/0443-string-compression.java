class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        int n = chars.length;
        while( i < n){
            char curr = chars[i];
            int cnt = 0;
            while(i < n && chars[i] == curr){
                cnt++;
                i++;
            }
            chars[index] = curr;
            index++;
            if(cnt > 1){
                String s = String.valueOf(cnt);
                for(char ch : s.toCharArray()){
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
    }
}