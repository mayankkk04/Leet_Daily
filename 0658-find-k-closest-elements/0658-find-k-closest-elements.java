class Solution {
    public class Pair implements Comparable<Pair> {
        int num1; 
        int num2; 

        public Pair(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.num1 != other.num1) {
                return other.num1 - this.num1;
            } else {
                return other.num2 - this.num2;
            }
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(); 

        for (int i = 0; i < arr.length; i++) {
            pq.offer(new Pair(Math.abs(arr[i] - x), arr[i]));
            if (pq.size() > k) pq.poll(); 
        }

        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().num2);
        }

        Collections.sort(result);
        return result;
    }
}
