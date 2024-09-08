package com.giyeon.data_structure.collection.link;

public class MyLinkedListV3<E> {


    private Node<E> first;
    private int size = 0;

    public void add(E o) {
        Node<E> x = first;
        if (x == null) {
            first = new Node(o);
        }else {
            Node<E> lastNode = getLastNode();
            lastNode.next = new Node(o);
        }
        size++;
    }

    public Object set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public E get(int index) {
        Node<E> x = getNode(index);
        return x.item;
    }

    private Node<E> getNode(int index) {

        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;

    }

    public int indexOf(E o) {
        int index = 0;

        for (Node<E> x = first; x != null; x = x.next) {
            if (x.item.equals(o)) {
                return index;
            }else {
                index++;
            }
        }
        return -1;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
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
    public void add(int index, E o) {
        Node<E> newNode = new Node<E>(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        }else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    //추가코드
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if(index == 0) {
            first = first.next;
        }else {

            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;

        return removeItem;
    }

    private static class Node<E>  {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                } else {
                    sb.append("]");
                }
                x = x.next;
            }
            return sb.toString();
        }

    }


}
