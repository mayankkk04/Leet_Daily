class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i= 0 ; i < nums.length ; i++){
            int num = Math.abs(nums[i]);
            int index = num-1;
            if(nums[index] < 0){
                res.add(num);
            }
            else nums[index] *= -1;
        }
        return res;
    }
}