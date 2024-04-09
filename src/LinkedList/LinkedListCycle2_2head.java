package LinkedList;

public class LinkedListCycle2_2head {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;
        while(head != null) {
            if(head.val == Integer.MAX_VALUE) {
                return head;
            }
            head.val = Integer.MAX_VALUE;
            head = head.next;
        }
        return head;
    }
}
