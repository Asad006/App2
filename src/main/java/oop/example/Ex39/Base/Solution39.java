package oop.example.Ex39.Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution39 {
    private static ArrayList<HashMap> dataArrarlist = new ArrayList<HashMap>();

    public static void main(String[] args) {
        // Default Initialization of a
        // Map
        HashMap<Integer, String> datEntery1 = new HashMap<>();


        // Inserting the Elements
        datEntery1.put(1, "John");
        datEntery1.put(2, "Johnson");
        datEntery1.put(3, "Manager");
        datEntery1.put(4, "2016-12-31");
        System.out.println(datEntery1.get(4));
        HashMap<Integer, String> datEntery2 = new HashMap<>();
        // Inserting the Elements
        datEntery2.put(1, "Tou");
        datEntery2.put(2, "Xiong");
        datEntery2.put(3, "Software Engineer");
        datEntery2.put(4, "2016-10-05");

        HashMap<Integer, String> datEntery3 = new HashMap<>();

        // Inserting the Elements
        datEntery3.put(1, "Michaela");
        datEntery3.put(2, "Michaelson");
        datEntery3.put(3, "District Manager");
        datEntery3.put(4, "2015-12-19");

        HashMap<Integer, String> datEntery4 = new HashMap<>();

        // Inserting the Elements
        datEntery4.put(1, "Jake");
        datEntery4.put(2, "Jacobson");
        datEntery4.put(3, "Programmer");
        datEntery4.put(4, "");

        HashMap<Integer, String> datEntery5 = new HashMap<>();

        // Inserting the Elements
        datEntery4.put(1, "Sally");
        datEntery4.put(2, "Webber");
        datEntery4.put(3, "Web Developer");
        datEntery4.put(4, "2015-12-18");

        System.out.println(datEntery1.values());
        dataArrarlist.add(datEntery1);
        dataArrarlist.add(datEntery2);
        dataArrarlist.add(datEntery3);
        dataArrarlist.add(datEntery4);
        dataArrarlist.add(datEntery5);

        SortData sortData = new SortData();
        sortData.sort(dataArrarlist);


    }
}
