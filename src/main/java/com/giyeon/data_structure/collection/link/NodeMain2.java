package com.giyeon.data_structure.collection.link;

public class NodeMain2 {

    public static void main(String[] args) {

        Node node = new Node("A");
        node.next = new Node("B");
        node.next.next = new Node("C");

        System.out.println(node.toString());



    }

}
