package com.giyeon.data_structure;


public class ThreadEx {

    // 스레드를 직접 생성해서 사용하는 방식

    // 1. Thread 클래스 상속
    public static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("Thread 상속 클래스의 객체");
        }
    }

    // 2. implements Runnable interface
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Runnable 구현 클래스");
        }
    }


    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();

        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        // 2-1. 인터페이스 --> [구현 클래스 --> 구현 객체]
        // 익명 클래스를 이용한 방식
        Thread thread2= new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    System.out.println("익명클래스를 이용한 스레드 생성 및 활용");
                                }
                            });
        thread2.start();

        // 2-2. 인터페이스 --> [구현 클래스 --> 구현 객체]
        // lambda 이용한 방식
        Thread thread3 = new Thread(()->{
                            System.out.println("람다를 이용한 구현");
                        });
        thread3.start();

    }

}
