package LinkedList;

public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode prev = node;
        ListNode cur = head;
        while(cur != null) {
            if(cur.val != val) {
                prev =  cur;
            }
            else prev.next = cur.next;
            cur = cur.next;
        }
        return node.next;
    }
}
