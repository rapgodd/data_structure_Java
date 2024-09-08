package com.giyeon.data_structure.collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();

        BatchProcessor batchProcessor = new BatchProcessor(list);

        batchProcessor.logic(10);

    }

}
