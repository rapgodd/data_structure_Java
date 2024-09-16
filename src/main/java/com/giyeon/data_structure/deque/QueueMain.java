package com.giyeon.data_structure.deque;

import java.util.ArrayDeque;

public class QueueMain {

    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        Integer peek = queue.peek();
        System.out.println(peek);

        Integer poll1 = queue.poll();
        System.out.println("poll1 = " + poll1);

        Integer poll2 = queue.poll();
        System.out.println("poll2 = " + poll2);

        Integer poll3 = queue.poll();
        System.out.println("poll3 = " + poll3);
    }

}
