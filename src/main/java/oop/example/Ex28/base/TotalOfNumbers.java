package oop.example.Ex28.base;

public class TotalOfNumbers {
    public int calculate(int[] number) {
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }
        return sum;
    }
}
