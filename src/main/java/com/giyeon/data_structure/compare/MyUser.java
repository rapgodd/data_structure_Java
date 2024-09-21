package com.giyeon.data_structure.compare;

public class MyUser implements Comparable<MyUser> {

    int age;
    String id;

    public MyUser(int age, String id) {
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(MyUser o) {
        return (this.age < o.age) ? -1 : ((this.age == o.age) ? 0 : 1);
    }

}
