package com.giyeon.data_structure.collection.set.member;

import java.util.Objects;

public class MemberOnlyHash {

    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

//    //objectㅇㅔ서는 참조값 비교로 equals 구현
//    //여기에서는 id 비교를 한다.
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MemberOnlyHash that = (MemberOnlyHash) o;
//        return id == that.id;
//    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
