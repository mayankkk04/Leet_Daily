class Task implements Comparable<Task>{
    int freq;
    int et;
    Task(int freq, int et){
        this.freq = freq;
        this.et = et;
    }
    public int compareTo(Task other){
        return other.freq - this.freq;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : tasks){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Task> pq = new PriorityQueue<>();
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            pq.offer(new Task(freq,0));
        }
        Queue<Task> q = new LinkedList<>();
        int time = 0;
        while(!q.isEmpty() || !pq.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                Task task = pq.poll();
                task.freq--;
                if(task.freq > 0){
                    task.et = time + n;
                    q.offer(task);
                }
            }
            if(!q.isEmpty() && q.peek().et == time){
                pq.offer(q.poll());
            }
        }
        return time;
    }
}