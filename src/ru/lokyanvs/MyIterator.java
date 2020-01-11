package ru.lokyanvs;

import java.util.*;
import java.util.function.Consumer;

public class MyIterator implements Iterator<String>, Iterable<String> {
    private List<String> arrayList;
    private ListIterator<String> listIterator;

     MyIterator(List<String> arrayList){
         this.arrayList=arrayList;
         listIterator=this.arrayList.listIterator(arrayList.size());
     }
    @Override
    public boolean hasNext() {
        return listIterator.hasPrevious();
    }

    @Override
    public String next() {
        return listIterator.previous();
    }

    @Override
    public void remove() {
        listIterator.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {
        listIterator.forEachRemaining(action);
    }

    @Override
    public Iterator<String> iterator() {
        return listIterator;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        listIterator.forEachRemaining(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return arrayList.spliterator();
    }
}