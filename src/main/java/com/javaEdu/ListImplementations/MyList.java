package com.javaEdu.ListImplementations;

public interface MyList {

    void add(Object e);
    void clear();
    boolean remove(Object e);
    Object[] toArray();
    int size();
    boolean contains(Object o);
    boolean containsAll(MyList c);

}
