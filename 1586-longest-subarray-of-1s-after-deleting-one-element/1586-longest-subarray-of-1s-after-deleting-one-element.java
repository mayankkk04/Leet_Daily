class Solution {
    public int longestSubarray(int[] nums) {
        int longest = 0;
        int n = nums.length;
        boolean hasZero = false;
        for(int i = 0 ; i < n ; i++){
            int cnt = 0;
            int cnt0 = 0;
            for(int j = i ; j < n ; j++){
                if(nums[j] == 0) {
                    hasZero = true;
                    cnt0++;
                }
                if(cnt0 > 1) break;
                if(nums[j] == 1) cnt++;
                longest = Math.max(longest,cnt);
            }
        }
        return (hasZero) ? longest : n-1;
    }
}