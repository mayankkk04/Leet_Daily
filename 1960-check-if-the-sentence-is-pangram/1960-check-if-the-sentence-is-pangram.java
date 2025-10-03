class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        int n = sentence.length();
        for(char ch : sentence.toCharArray()){
            arr[ch - 'a'] = 1;
        }
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 0) return false;
        }
        return true;
    }
}