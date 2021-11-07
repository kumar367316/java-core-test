package com.core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(5,"Akash");
        Employee e2 = new Employee(3,"Akash");

        Employee e3 = new Employee(4,"Akash");
        Employee e4 = new Employee(2,"Akash");
        Employee e5 = new Employee(1,"Akash");


        Student s = new Student(100,"Bharat");
        ArrayList list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        //list.add(s);
        System.out.println("list Before Sorting:"+list.toString());


        System.out.println("**************************");
        Collections.sort(list);
        System.out.println("list After Sorting:"+list.toString());


    }
}
