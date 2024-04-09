package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2LinkedList_Optimal {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while(headB != null) {
            set.add(headB);
            headB = headB.next;
        }
        while(headA != null) {
            if(set.contains(headA)) return headA;
            headA = headA.next;
        }
        return null;
    }
}
