class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        String str = s;
        int idx = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '9'){
                idx = i;
                break;
            }
        }
        if(idx < s.length()){
            s = s.replace(s.charAt(idx),'9');
        }
        str = str.replace(str.charAt(0),'0');
        return Integer.parseInt(s) - Integer.parseInt(str);
    }
}