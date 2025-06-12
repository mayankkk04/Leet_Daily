class Solution {
    class Card{
        int card;
        int count;
        public Card(int card, int count){
            this.card = card;
            this.count = count;
        }
    }
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        if(groupSize == 1) return true;
        PriorityQueue<Card> pq  = new PriorityQueue<>(new Comparator<>(){
            public int compare(Card c1, Card c2){
                return Integer.compare(c1.card,c2.card);
            }
        });
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : hand){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int key : map.keySet()){
            pq.offer(new Card(key, map.get(key)));
        }
        while(!pq.isEmpty()){
            Card c = pq.poll();
            Queue<Card> q = new LinkedList<>();
            c.count--;
            for(int i = 1 ; i < groupSize; i++){
                if(!pq.isEmpty() && c.card + i == pq.peek().card){
                    Card curr = pq.poll();
                    curr.count--;
                    if(curr.count >= 1){
                        q.add(curr);
                    }
                }else return false;
            }
            while(!q.isEmpty()){
                pq.offer(q.poll());
            }
            if(c.count >= 1) pq.offer(c);
        }
        return true;
    }
}