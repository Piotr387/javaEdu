package com.javaEdu.ListImplementations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListImplementationsHomework {

    private static final int milion = 1_000_000;
    private static final int enteredValue = Integer.MAX_VALUE;

    //main menu to check effinect between ArrayList & LinkedList
    public static void homeworkMain() {
        ArrayList<Integer> firstArr = new ArrayList();
        LinkedList<Integer> secondArr = new LinkedList();

        addElements(firstArr, "begin");
        addElements(secondArr, "begin");

        addElements(firstArr, "middle");
        addElements(secondArr, "middle");

        addElements(firstArr, "end");
        addElements(secondArr, "end");
    }

    /*
    List size: 1000000
    Adding 100 elements into the beginning of the List
    Mesurement time: 15758 ms
    List size: 1000000
    Adding 10000 elements into the beginning of the List
    Mesurement time: 1809284 ms
    List size: 1000000
    Adding 100000 elements into the beginning of the List
    Mesurement time: 19388151 ms
    List size: 1000000
    Adding 100 elements into the beginning of the List
    Mesurement time: 7 ms
    List size: 1000000
    Adding 10000 elements into the beginning of the List
    Mesurement time: 145 ms
    List size: 1000000
    Adding 100000 elements into the beginning of the List
    Mesurement time: 128 ms

    Process finished with exit code 0a
     */


    public static void initMilion(List<Integer> list, int numberOfElements){
        for (int i = 0; i < numberOfElements; i++) {
            list.add(Integer.MAX_VALUE);
        }
    }

    public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd) {
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            list.add(0, enteredValue);
        }
    }

    public static void addElementsToMiddle(List<Integer> list, int numberOfElementsToAdd) {
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            list.add(list.size() / 2, enteredValue);
        }
    }

    public static void addElementsToEnd(List<Integer> list, int numberOfElementsToAdd) {
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            list.add(enteredValue);
        }
    }

    public static void removeElementsFromBeginning(List<Integer> list, int numberOfElementsToRemove) {
        for (int i = 0; i < numberOfElementsToRemove; i++) {
            list.remove(0);
        }
    }

    public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove) {
        for (int i = 0; i < numberOfElementsToRemove; i++) {
            list.remove(list.size() / 2);

        }
    }

    public static void removeElementsFromEnd(List<Integer> list, int numberOfElementsToRemove) {
        for (int i = 0; i < numberOfElementsToRemove; i++) {
            list.remove(list.size() - 1);

        }
    }

    public static void addElements(List<Integer> list, String where) {

        list.clear();
        initMilion(list,milion);
        howManyTimes(list,where,100);

        list.clear();
        initMilion(list,milion);
        howManyTimes(list,where,10_000);

        //Commented line because of long executiuon time for LinkedListed is more than 10 hours
        //So quite a long time
//        list.clear();
//        initMilion(list,milion);
//        howManyTimes(list,where,100_000);
    }

    private static void howManyTimes(List<Integer> list, String where, int howMany){
        System.out.println("List size: " + list.size());
        System.out.println("Type of array: " + list.getClass().getName());
        long mill = System.nanoTime();
        if (where == "begin"){
            System.out.println("Adding " + howMany +" elements into the beginning of the List");
            addElementsToBeginning(list, howMany);
        } else if (where == "middle") {
            System.out.println("Adding " + howMany +" elements into the middle of the List");
            addElementsToMiddle(list, howMany);
        } else {
            System.out.println("Adding " + howMany +" elements into the end of the List");
            addElementsToEnd(list, howMany);
        }
        long delta = (System.nanoTime() - mill) / 10000;
        System.out.println("Mesurement time: " + delta + " ms");
    }


}

//    Output of execution:
//
//
//        List size: 1000000
//        Type of array: java.util.ArrayList
//        Adding 100 elements into the beginning of the List
//        Mesurement time: 22861 ms
//        List size: 1000000
//        Type of array: java.util.ArrayList
//        Adding 10000 elements into the beginning of the List
//        Mesurement time: 887057 ms
//        List size: 1000000
//        Type of array: java.util.LinkedList
//        Adding 100 elements into the beginning of the List
//        Mesurement time: 8 ms
//        List size: 1000000
//        Type of array: java.util.LinkedList
//        Adding 10000 elements into the beginning of the List
//        Mesurement time: 148 ms
//        List size: 1000000
//        Type of array: java.util.ArrayList
//        Adding 100 elements into the middle of the List
//        Mesurement time: 848 ms
//        List size: 1000000
//        Type of array: java.util.ArrayList
//        Adding 10000 elements into the middle of the List
//        Mesurement time: 79921 ms
//        List size: 1000000
//        Type of array: java.util.LinkedList
//        Adding 100 elements into the middle of the List
//        Mesurement time: 15726 ms
//        List size: 1000000
//        Type of array: java.util.LinkedList
//        Adding 10000 elements into the middle of the List
//        Mesurement time: 1626664 ms
//        List size: 1000000
//        Type of array: java.util.ArrayList
//        Adding 100 elements into the end of the List
//        Mesurement time: 40 ms
//        List size: 1000000
//        Type of array: java.util.ArrayList
//        Adding 10000 elements into the end of the List
//        Mesurement time: 55 ms
//        List size: 1000000
//        Type of array: java.util.LinkedList
//        Adding 100 elements into the end of the List
//        Mesurement time: 9 ms
//        List size: 1000000
//        Type of array: java.util.LinkedList
//        Adding 10000 elements into the end of the List
//        Mesurement time: 63 ms

