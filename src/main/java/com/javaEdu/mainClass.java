package com.javaEdu;

import com.javaEdu.ListImplementations.DefaultMyList;
import com.javaEdu.ListImplementations.ListImplementationsHomework;

public class mainClass {

    public static void main(String[] args) {
        // ListImplementationsHomework.homeworkMain();

        DefaultMyList newList = new DefaultMyList();
        for (int i = 0; i < 10; i++) {
            newList.add(i);
        }
        newList.add("String");
        System.out.println(newList.toString());
        newList.remove(5);
        System.out.println(newList.toString());

        int test = 1;
        if (newList.contains(test)){
            System.out.println("Tablica zawiera element " + test);
        } else {
            System.out.println("Tablica nie zawiera " + test);
        }

        if (newList.containsAll(newList)){
            System.out.println("Tablica zawiera elementy drugiej tablicy");
        } else {
            System.out.println("Tablica nie zawiera elementów drugiej tablicy");
        }
    }

}
