package LinkedList;

public class IntersectionOf2LinkedList_BruteForce {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA != null) {
            ListNode node = headB;
            while(node != null) {
                if(headA == node) return headA;
                node = node.next;
            }
            headA = headA.next;
        }
        return null;
    }
}
