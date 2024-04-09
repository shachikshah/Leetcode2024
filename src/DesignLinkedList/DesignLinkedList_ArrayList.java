package DesignLinkedList;

import java.util.ArrayList;

public class DesignLinkedList_ArrayList {
    ArrayList<Integer> list;

    public void MyLinkedList() {
        list = new ArrayList<>();
    }

    public int get(int index){
        if(index >= list.size()) return -1;
        else return list.get(index);
    }

    public void addAtHead(int val){
        list.add(0, val);
    }

    public void addAtTail(int val){
        list.add(val);
    }

    public void addAtIndex(int index, int val){
        if(index > list.size()) return;
        else list.add(index, val);
    }

    public void deleteAtIndex(int index){
        if(index >= list.size()) return;
        list.remove(index);
    }
}
