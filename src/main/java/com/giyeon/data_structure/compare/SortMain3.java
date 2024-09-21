package com.giyeon.data_structure.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {

        /**
         * 객체를 나이순으로 비교해 출력한다.
         */

        MyUser 기연 = new MyUser(10, "기연");
        MyUser 윤지 = new MyUser(40, "윤지");
        MyUser 자루 = new MyUser(30, "자루");

        MyUser[] myUsers = {기연,자루,윤지};
        Arrays.sort(myUsers);

        System.out.println(Arrays.toString(myUsers));

        Arrays.sort(myUsers,new IdComparator());
        System.out.println(Arrays.toString(myUsers));

    }

}
