class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        int n = nums.length;
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int j = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) {
                res[j] = entry.getKey();
                j++;
            } 
        }
        return res;
    }
}