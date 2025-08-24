class Solution {
    public int longestSubarray(int[] nums) {
        int longest = 0;
        int n = nums.length;
        int cntZero = 0;
        int lastZero = -1;
        int i = 0;
        int j = 0;
        while(j < n){
            if(nums[j] == 0){
                i = lastZero+1;
                lastZero = j;
            }
            longest = Math.max(longest, j-i);
            j++;
        }
        return longest;
    }
}