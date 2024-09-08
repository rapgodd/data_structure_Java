package com.giyeon.data_structure.collection.list;

public class BatchProcessor {

    /**
     * 이렇게 하면 타입이 바뀌어도 코드를 바꾸지 않고 리스트를 사용할 수 있다.
     */
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("required time = " + (endTime - startTime));
    }

}

