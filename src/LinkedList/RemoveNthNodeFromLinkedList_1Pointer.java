package LinkedList;

public class RemoveNthNodeFromLinkedList_1Pointer {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
        ListNode node = head;
        while(node != null) {
            node = node.next;
            i++;
        }
        if(i == n) return head.next;
        int  removeNodeNumber = i-n-1;
        ListNode curNode = head;
        for(int j = 0; j < removeNodeNumber; j++){
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
        return head;
    }
}
