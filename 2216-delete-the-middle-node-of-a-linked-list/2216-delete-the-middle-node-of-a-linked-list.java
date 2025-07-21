/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        if(head == null || head.next == null) return null;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        int res = cnt/2;
        temp = head;
        while(temp != null){
            res--;
            if(res == 0){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}