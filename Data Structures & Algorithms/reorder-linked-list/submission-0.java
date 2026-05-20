class Solution {
    public void reorderList(ListNode head) {
        // Base case: 0, 1, or 2 nodes don't need reordering or will handle safely
        if (head == null || head.next == null || head.next.next == null) return;
        
        // Step 1: Find the middle of the list safely
        ListNode s = head;
        ListNode f = head;
        // FIXED: Changed || to && to prevent NullPointerException
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null;
        ListNode curr = s.next; 
        s.next = null; // Sever the connection here to split the list in half

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Step 3: Merge the two halves alternately
        ListNode first = head, second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }
}
