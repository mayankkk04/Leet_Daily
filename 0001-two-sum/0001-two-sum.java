class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int num = nums[i];
            int more = target - num;
            if(map.containsKey(more)){
                return new int[]{map.get(more),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}