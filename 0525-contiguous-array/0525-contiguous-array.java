class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = nums.length;
        int maxLen = 0;
        int sum = 0;
        // int len = 0;
        for(int i = 0; i < n ; i++){
            sum = (nums[i] == 0) ? sum-1 : sum+1;
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
} 