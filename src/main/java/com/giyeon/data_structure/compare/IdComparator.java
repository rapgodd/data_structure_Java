package com.giyeon.data_structure.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        int i = o1.getId().compareTo(o2.getId());
        return i;
    }
}
