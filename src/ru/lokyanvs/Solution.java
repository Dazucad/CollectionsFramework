package ru.lokyanvs;

import java.util.*;

public class Solution {
    private List<String> wordsList = new ArrayList<>();
    private List<String> stringsList = new ArrayList<>();

    Solution(String s) {
        String[] words, strings;
        if (!s.equals("")) {
            words = s.split("[\\s,\\n]");
            strings = s.split("\n");
        } else {
            System.out.println("Файл пустой");
            return;
        }
        Collections.addAll(wordsList, words);
        Collections.addAll(stringsList, strings);
/*        wordsList.removeAll(Arrays.asList(""));
        stringsList.removeAll(Arrays.asList(""));*/
    }

    int task1() {
        Set<String> set = new HashSet<>(wordsList);
        return set.size();
    }

    void task2() {
        MyComparator myComp = new MyComparator();
        TreeSet<String> treeSet = new TreeSet(myComp);
        treeSet.addAll(wordsList);
        System.out.println("\nСписок различных слов:");
        for (String s :
                treeSet) {
            System.out.println(s);
        }
    }

    void task3() {
        Map<String, Integer> myMap = new HashMap<>();
        for (String s :
                wordsList) {
            if (myMap.containsKey(s)) myMap.put(s, myMap.get(s) + 1);
            else myMap.put(s, 1);
        }

        System.out.println("\nКоличество повторений слов:");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    void task4() {
        System.out.println("\nСтроки в обратном порядке:");
        for (int i = stringsList.size() - 1; i >= 0; i--) {
            System.out.println(stringsList.get(i));
        }
    }

    void task5() {
        MyIterator myIterator = new MyIterator(stringsList);
        System.out.println("\nСтроки в обратном порядке с использованием своего итератора:");
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }

    void task6() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер строки для вывода(для выхода введите любую букву)");
            try {
                System.out.println(stringsList.get(scanner.nextInt() - 1));
            } catch (InputMismatchException e) {
                return;
            }
        }
    }

}
