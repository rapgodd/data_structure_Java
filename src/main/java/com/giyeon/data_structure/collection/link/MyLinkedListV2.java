package com.giyeon.data_structure.collection.link;

public class MyLinkedListV2 {


    private Node first;
    private int size = 0;

    public void add(Object o) {
        Node x = first;
        if (x == null) {
            first = new Node(o);
        }else {
            Node lastNode = getLastNode();
            lastNode.next = new Node(o);
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = new Node(element);
        return oldValue;
    }

    public Object get(int index) {
        Node x = getNode(index);
        return x.item;
    }

    private Node getNode(int index) {

        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;

    }

    public int indexOf(Object o) {
        int index = 0;

        for (Node x = first; x != null; x = x.next) {
            if (x.item.equals(o)) {
                return index;
            }else {
                index++;
            }
        }
        return -1;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    //추가 코드
    public void add(int index, Object o) {
        Node newNode = new Node(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        }else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    //추가코드
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if(index == 0) {
            first = first.next;
        }else {

            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;

        return removeItem;
    }


}
