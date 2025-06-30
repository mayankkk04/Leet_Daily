class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int k = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0) {
                temp[k] = nums[i];
                k++;
            }
        }
        int m = temp.length;
        for(int i = 0 ; i < m ; i++){
            nums[i] = temp[i];
        }
        for(int i = m ; i < n ; i++){
            nums[i] = 0;
        }
    }
}