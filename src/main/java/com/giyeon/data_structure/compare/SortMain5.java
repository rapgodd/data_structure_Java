package com.giyeon.data_structure.compare;

import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {

        /**
         * treeSet겉은 경우에는
         * 들어가자마자 정렬을 하기 때문에
         * Comparater를 구현해 놓아야 한다.
         */
        MyUser 기연 = new MyUser(10, "기연");
        MyUser 윤지 = new MyUser(40, "윤지");
        MyUser 자루 = new MyUser(30, "자루");

        Set<MyUser> treeSet = new TreeSet<>();
        treeSet.add(기연);
        treeSet.add(윤지);
        treeSet.add(자루);
        System.out.println("treeSet = " + treeSet);

    }

}
