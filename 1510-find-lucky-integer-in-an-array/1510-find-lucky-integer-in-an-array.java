class Solution {
    public int findLucky(int[] arr) {
        int largest = 0;
        int cnt = 0;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++ ){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == map.get(arr[i])){
                if(arr[i] > largest) largest = arr[i];
            };
        }
        return (largest == 0) ? -1 : largest;
    }
}