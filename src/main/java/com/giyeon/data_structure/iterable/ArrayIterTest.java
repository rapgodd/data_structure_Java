package com.giyeon.data_structure.iterable;

import java.util.Iterator;

public class ArrayIterTest {

    public static void main(String[] args) {

        MyArray integerArray = new MyArray(new int[]{1, 2, 3, 4, 5});
        Iterator<Integer> iterator = integerArray.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("value = " + next);
        }

        /**
         * 클래스가 Iterable를 구현하면
         * 향상된 for문을 사용할 수 있다.
         *
         * 향상된 for문은
         * 배열이거나 Iterable를 구현한 클래스만
         * 사용이 가능하다
         */
        System.out.println("향상된 for문 실행");
        for (Integer value : integerArray) {
            System.out.println("value = " + value);
        }

        /**
         * Map의 경우에는 Key와 Value가 같이 있기 때문에
         * iterator를 사용할수 없다 -> 향상된 for문도 사용할 수 없다.
         * 사용 하기 위해서는 Key와 Value를 따로 뽑아낸 다음 하여야 한다.
         * keySet(), entrySet(), values()
         */

    }
}
