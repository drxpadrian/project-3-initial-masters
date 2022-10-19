package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T> {

    List<T> stringBag;

    public Bag() {
        stringBag = new ArrayList<>();
    }
    @Override
    public boolean isEmpty() {
        return this.stringBag.isEmpty();
    }

    @Override
    public int size() {
        return this.stringBag.size() + 1;
    }

    @Override
    public void add(T item) {
        this.stringBag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.stringBag.iterator();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bag{");
        sb.append("stringBag=").append(stringBag);
        sb.append('}');
        return sb.toString();
    }
}
