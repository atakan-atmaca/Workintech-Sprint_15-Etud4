package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> {
    private ArrayList<T> list;

    public WorkintechList() {
        this.list = new ArrayList<>();
    }

    public boolean add(T element) {
        if (!list.contains(element)) {
            list.add(element);
            sort();
            return true;
        }
        return false;
    }

    public void remove(T element) {
        list.remove(element);
        sort();
    }

    public void sort() {
        Collections.sort(list);
    }

    public ArrayList<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
