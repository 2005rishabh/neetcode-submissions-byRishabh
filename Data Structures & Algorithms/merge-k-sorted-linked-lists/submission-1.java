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
        if(lists.length == 0) return null;
        for (int i = 1; i < lists.length; i++) {
            lists[i] = merge(lists[i], lists[i - 1]);
        }
        return lists[lists.length - 1];
    }


    public ListNode merge(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                res.next = list1;
                list1 = list1.next;
            } else {
                res.next = list2;
                list2 = list2.next;
            }

            res = res.next;
        }

        if (list1 != null) {
            res.next = list1;
        }

        if (list2 != null) {
            res.next = list2;
        }

        return dummy.next;
    }
}
