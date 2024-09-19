package com.giyeon.data_structure.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> storingTaskQueue = new ArrayDeque<>();

    public void addTask(Task task) {
        storingTaskQueue.offer(task);
    }

    public int getRemainingTasks() {
        int size = storingTaskQueue.size();
        return size;
    }

    public void processNextTask() {
        Task task = storingTaskQueue.poll();
        task.execute();
    }
}
