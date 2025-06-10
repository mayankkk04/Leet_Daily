class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;
        map.put(0,1);
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            if(map.containsKey(sum - goal)){
                cnt += map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}