package com.giyeon.data_structure.deque.test.queue;

public class BackupTask implements Task {
    @Override
    public void execute() {
        System.out.println("사용하지 않는 자원 정리...");
    }
}
