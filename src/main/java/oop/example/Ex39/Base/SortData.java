package oop.example.Ex39.Base;

import java.util.*;

public class SortData {
    public void sort(ArrayList<HashMap> dataArrarlist) {
        Map<Integer, String> temp = new HashMap<>();
        Map<Integer, String> temp0 = new HashMap<>();

       Comparator<Map<Integer, String>> mapComparator = (Comparator<Map<Integer, String>>) (data1, data2) -> data1.get(1).compareTo(data2.get(1));


        for (HashMap entry : dataArrarlist){
            System.out.println(entry.get(1));
            // Do something with value here
        }

        //return dataArrarlist
        for (int i = 0; i < dataArrarlist.size(); i++) {


        }
    }


}
