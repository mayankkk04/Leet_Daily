class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        for(int i = 0 ; i < nums.length-1 ; i++){
            int cnt = 1;
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[j] == nums[i]) cnt++;
            }
            if(cnt > n/2) return nums[i];
        }
        return -1;
    }
}