package com.giyeon.data_structure.map.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        Member member = memberMap.get(id);
        return member;
    }

    public Member findByName(String name) {
        for (Member value : memberMap.values()) {
            String name1 = value.getName();
            if (name1.equals(name)) {
                return value;
            }
        }
        return null;
    }

}
