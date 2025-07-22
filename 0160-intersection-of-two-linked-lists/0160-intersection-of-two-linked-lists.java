/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while(temp != null){
            // map.put(temp, map.getOrDefault(temp,0)+1);
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            // if(map.get(temp) == 1) return temp;
            if(set.contains(temp)) return temp;
            temp = temp.next;
        }
        return null;
    }
}