package com.giyeon.data_structure.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        queue.offer("DocA");
        queue.offer("DocB");
        queue.offer("DocC");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

}
