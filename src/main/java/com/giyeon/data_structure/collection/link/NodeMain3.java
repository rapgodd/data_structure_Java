package com.giyeon.data_structure.collection.link;

public class NodeMain3 {

    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 인덱스의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
    }


    private static void add(Node node, String value) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(value);
    }


    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }


    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

}

