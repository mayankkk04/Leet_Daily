class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int XOR1 = 0;
        for(int i = 0 ; i <= n ; i++){
            XOR1 ^= i;
        }
        int XOR2 = 0;
        for(int i = 0 ; i < n ; i++){
            XOR2 ^= nums[i];
        }
        return XOR1^XOR2;
    }
}