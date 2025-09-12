class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            ans ^= nums[i];
        }
        return ans;
        // int n = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i : nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if(entry.getValue() == 1) return entry.getKey();
        // }
        // return 0;
    }
}