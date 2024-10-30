package com.giyeon.data_structure.backjoon;

public class Memory {

    public static void main(String[] args) {
        int a = 1;
        int i = method1(a);
        System.out.println("i = " + i);
        System.out.println("a = " + a);

        MemoryTest1 memoryTest1 = new MemoryTest1();
        int c = memoryTest1.getC();
        System.out.println("c = " + c);

        method2(memoryTest1);
        System.out.println("c = " + memoryTest1.getC());



    }

    private static int method1(int x) {
        return x + 1;
    }

    private static int method2(MemoryTest1 x) {
        return x.changeValue();
    }

    static class MemoryTest1{
        public int c = 10;

        public int changeValue(){
            this.c = 11;
            return c;
        }

        public int getC() {
            return c;
        }
    }

}
