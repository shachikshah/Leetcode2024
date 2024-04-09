package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle_Set {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if (head == null || head.next == null) return false;
        while(head != null) {
            if(set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
