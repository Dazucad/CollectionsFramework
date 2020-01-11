package ru.lokyanvs;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        if (s.length() != t1.length()) return s.length()-t1.length();
        else return s.compareTo(t1);

    }
}
