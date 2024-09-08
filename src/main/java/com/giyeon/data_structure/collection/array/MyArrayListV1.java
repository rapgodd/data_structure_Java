package com.giyeon.data_structure.collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    /**
     * 메서드의 파라미터에 값을 집어넣으면,
     * 그 값이 배열 해당 인덱스의 값이 된다.
     * 그리고 값 다른거 집어넣으면 자동으로 다음 인덱스 값으로 들어간다.
     */
    public void add(Object o) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = o;
        size++;
    }

    private void grow() {
        int newLength = elementData.length * 2;

//        Object[] newObj = new Object[newLength];
//        for(int i = 0; i < size; i++) {
//            newObj[i] = elementData[i];
//        }

        //기존 배열을 기반으로 새로운 길이의 배열을 쉽게 만드는 방법
        Object[] newObj = Arrays.copyOf(elementData, newLength);

        elementData = newObj; // 참조값 바꿔 치기
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object o = get(index);//
        elementData[index] = element;
        return o;//대체된 값을 반환한다.
    }

    /**
     * 매게변수 값이 배열 안에 존재하는지 확인
     * 값이 존재하면 인덱스 번호 반환
     * 아니면 -1 반환
     * */
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if(elementData[i] == o){
                return i;
            }
        }
        return -1;
    }

    /**
     *copy of 라는 메서드의 인자는 1, 배열 2, 배열에서 가지고 오고 싶은 인덱스 번호이다.
     */
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " Size: "+ size
                + ", Capacity: "+elementData.length;
    }

    public void add(int index, Object element) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[index] = element;
        size++;
    }

    //인덱스 포함 인덱스 오른쪽에 있는거 다 한칸식 오른쪽으러 넘김.
    private void shiftRightFrom(int index) {
        for (int i = size; i < index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    private void remove(int index) {
        Object o = get(index);
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i+1];
        }

        size--;
        elementData[size] = null;
    }

}
