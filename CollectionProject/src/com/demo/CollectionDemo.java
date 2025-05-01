package com.demo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList();

        arrayList.add(new Student(101,"Nayan", 79));
        arrayList.add(new Student(107,"Sagar", 98));
        arrayList.add(new Student(105,"Rohit", 82));
        arrayList.add(new Student(108,"Manoj", 78));
        arrayList.add(new Student(104,"Abdul", 93));

        System.out.println(arrayList);

        Collections.sort(arrayList, new MarksComparator());

        System.out.println("Sorted list>>" +arrayList);

    }
}
