package LinkedList;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode eNode = head.next;
        ListNode oNode = head;
        ListNode temp1 = eNode;
        while(eNode != null && eNode.next != null) {
            oNode.next = oNode.next.next;
            eNode.next = eNode.next.next;
            oNode = oNode.next;
            eNode = eNode.next;
        }
        oNode.next = temp1;
        return head;
    }
}
