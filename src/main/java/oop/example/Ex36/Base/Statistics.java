package oop.example.Ex36.Base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Statistics<retur> {

    public float average(ArrayList<Integer> numbersArrayList) {
        float sum = 0;
        for (int i = 0; i < numbersArrayList.size(); i++) {
            sum += numbersArrayList.get(i);
        }
        return sum / numbersArrayList.size();

    }

    public double getMminimum(ArrayList<Integer> numbersArrayList) {
        double min = numbersArrayList.get(0);
        for (int i = 0; i < numbersArrayList.size(); i++) {
            if (numbersArrayList.get(i)<min){
                min=numbersArrayList.get(i);
            }
        }
        return min;
    }

    public double getMaximum(ArrayList<Integer> numbersArrayList) {
        double max = numbersArrayList.get(0);
        for (int i = 0; i < numbersArrayList.size(); i++) {
            if (numbersArrayList.get(i)>max){
                max=numbersArrayList.get(i);
            }
        }
        return max;

    }


    public double standardDeviation(float average, ArrayList<Integer> numbersArrayList) {
        double stdDev;
        double sum=0;

        for (int i = 0; i < numbersArrayList.size(); i++) {
            sum += Math.pow((numbersArrayList.get(i) - average), 2);

        }

        stdDev = Math.sqrt(sum / (numbersArrayList.size()));
        return Math.round(stdDev*100.0)/100.0;
    }

}
