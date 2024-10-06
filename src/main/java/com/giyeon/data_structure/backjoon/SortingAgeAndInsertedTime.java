package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.Arrays;

public class SortingAgeAndInsertedTime {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer numberOfMember = Integer.parseInt(br.readLine());

        NameAndTime[] nameAndTimeArr = new NameAndTime[numberOfMember];

        for (int i = 0; i < numberOfMember; i++) {
            String ageAndName = br.readLine();
            String[] splitAgeAndName = ageAndName.split(" ");
            String stringAge = splitAgeAndName[0];
            int age = Integer.parseInt(stringAge);
            String name = splitAgeAndName[1];
            NameAndTime nameAndTime = new NameAndTime(age,name);
            nameAndTimeArr[i] = nameAndTime;
        }

        Arrays.sort(nameAndTimeArr);
        for (NameAndTime nameAndTime : nameAndTimeArr) {
            String name = nameAndTime.getName();
            Integer age = nameAndTime.getAge();
            String sAge = String.valueOf(age);
            bw.write(sAge + " " + name+"\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}

class NameAndTime implements Comparable<NameAndTime> {

    private final Integer age;
    private final String name;

    public NameAndTime(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(NameAndTime o) {
        return (this.age > o.age) ? 1 : (!(this.age.equals(o.age))) ? -1 : 0;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
