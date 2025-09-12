class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ones = 0,twos = 0;
        for(int i = 0 ; i < n ; i++){
            ones = ones^nums[i] & (~twos);
            twos = twos^nums[i] & (~ones);
        }
        return ones;
        // Arrays.sort(nums);
        // for(int i = 1 ; i < n ; i = i+3){
        //     if(nums[i] != nums[i-1]) return nums[i-1];
        // }
        // return nums[n-1];
    }
}