package com.javaEdu.ListImplementations;

import java.util.ArrayList;
import java.util.Arrays;

public class DefaultMyList implements MyList{

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public DefaultMyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(Object e) {
        if (e == null){
            return;
        }
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = e;
    }

    private void increaseCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean remove(Object e) {
        for (int i = 0; i < elements.length-1; i++) {
            if (elements[i].equals(e)){
                for (int j = i; j < elements.length-2; j++) {
                    elements[j] = elements[j+1];
                }
                elements[elements.length-1] = null;
                return true;
            }

        }
        return false;
    }

    @Override
    public Object[] toArray() {
        int nonNullElementsCount = 0;
        for (Object element: elements) {
            if (element != null){
                nonNullElementsCount++;
            }
        }

        Object[] nonNullElements = new Object[nonNullElementsCount];
        int index = 0;
        for (Object element: elements){
            if (element != null) {
                nonNullElements[index++] = element;
            }
        }
        return  nonNullElements;
    }

    @Override
    public int size() {
        int nonNullElementsCount = 0;
        for (Object element: elements) {
            if (element != null){
                nonNullElementsCount++;
            }
        }
        return nonNullElementsCount;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null){
            return false;
        }
        for (Object element: elements) {
            if (element.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(MyList c) {
        for (Object searchedElement: c.toArray()) {
            if (!contains(searchedElement)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {

        return Arrays.toString(this.toArray());
    }
}
