package LinkedList;

public class RemoveNthNodeFromLinkedList_2Pointer {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastNode = head;
        for(int i = 0; i < n; i++) fastNode = fastNode.next;
        if(fastNode == null) return head.next;
        ListNode slowNode = head;
        while(fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        slowNode.next = slowNode.next.next;
        return head;
    }
}
