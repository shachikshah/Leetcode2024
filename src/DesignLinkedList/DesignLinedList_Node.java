package DesignLinkedList;

public class DesignLinedList_Node {
    class MyLinkedList {

        class Node
        {
            int val;
            Node next;

            Node(int val)
            {
                this.val = val;
            }
        }

        Node dummyNode;
        int size;

        public MyLinkedList() {
            dummyNode = new Node(-1);
            size = 0;
        }

        public int get(int index) {
            if(index >= size)
                return -1;

            Node currNode = dummyNode;

            for(int i=0;i<=index;i++)
            {
                currNode = currNode.next;
            }

            return currNode.val;
        }

        public void addAtHead(int val) {
            Node head = new Node(val);
            head.next = dummyNode.next;
            dummyNode.next = head;
            size++;
        }

        public void addAtTail(int val) {
            Node curr = dummyNode;
            Node tail = new Node(val);

            for(int i=0;i<size;i++)
            {
                curr = curr.next;
            }

            curr.next = tail;
            size++;
        }

        public void addAtIndex(int index, int val) {
            if(index > size)
                return;

            Node curr = dummyNode;
            Node newNode = new Node(val);

            for(int i=0;i<index;i++)
            {
                curr = curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }

        public void deleteAtIndex(int index) {
            if(index >= size)
                return;

            Node curr = dummyNode;

            for(int i=0;i<index;i++)
            {
                curr = curr.next;
            }

            curr.next = curr.next.next;
            size--;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
