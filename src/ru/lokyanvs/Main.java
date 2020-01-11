package ru.lokyanvs;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String s = "";

        try (BufferedReader br = new BufferedReader(new FileReader(new File("Strings.txt")))) {
            String string;
            while ((string = br.readLine()) != null) s = s + string + "\n";
        } catch (Exception ex) {
            System.out.println("Error");
        }

        Solution solution = new Solution(s);
        System.out.println("Количество различных слов в файле: " + solution.task1());
        solution.task2();
        solution.task3();
        solution.task4();
        solution.task5();
        solution.task6();
    }
}
