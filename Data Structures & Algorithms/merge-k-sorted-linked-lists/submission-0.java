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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            ListNode t = lists[i];
            while(t != null) {
                pq.add(t.val);
                t = t.next;
            }
        }

        if(pq.isEmpty()) return null;
        ListNode d = new ListNode(-1);
        ListNode r = d;
        while(!pq.isEmpty()) {
            r.next = new ListNode(pq.poll());
            r = r.next;
        }

        return d.next;
    }
}
