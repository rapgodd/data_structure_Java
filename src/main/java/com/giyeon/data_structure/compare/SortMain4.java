package com.giyeon.data_structure.compare;

import java.util.ArrayList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        /**
         * 정렬(compare)은
         * 자료구조에서도 사용 가능하다
         * 단, 순서가 있는 자료구조이어야 한다.
         * Set불가능 Map불가능 List가능
         */
        MyUser 기연 = new MyUser(10, "기연");
        MyUser 윤지 = new MyUser(40, "윤지");
        MyUser 자루 = new MyUser(30, "자루");

        List<MyUser> myUsers = new ArrayList<>();
        myUsers.add(기연);
        myUsers.add(윤지);
        myUsers.add(자루);

        myUsers.sort(null);
        System.out.println("myUsers = " + myUsers);

        myUsers.sort(new IdComparator());
        System.out.println("myUsers = " + myUsers);
    }


}
