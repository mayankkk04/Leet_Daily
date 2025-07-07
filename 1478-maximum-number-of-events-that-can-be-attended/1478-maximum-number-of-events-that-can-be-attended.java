// class Pair implements Comparable<Pair>{
//     int start;
//     int end;
//     Pair(int start, int end){
//         this.start = start;
//         this.end = end;
//     }
//     public int compareTo(int that){
//         if(this.start == that.start) {
//             return this.end - that.end;
//         }
//         return this.start - that.start;
//     }

// }
class Solution {
    public int maxEvents(int[][] events) {
        //sort events based on start day
        //skip events whose end day < currday
        //pick the one ending early
        int cnt = 0;
        int n = events.length;
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int currday = events[0][0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        while(!pq.isEmpty() || i < n){
            while(i < n && events[i][0] == currday){
                pq.offer(events[i][1]);
                i++;
            }
            if(!pq.isEmpty()){
                pq.poll();
                cnt++;
            }
            currday++;
            while(!pq.isEmpty() && pq.peek() < currday){
                pq.poll();
            }
        }
        return cnt;
    }
}