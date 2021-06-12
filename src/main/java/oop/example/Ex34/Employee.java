package oop.example.Ex34;

public class Employee {
    private String[] employee = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};


    public String[] remove(String employeeName, String[] array) {
        String[] newArray = new String[array.length - 1];
        String temp;
        int i = 0;
        int j = 0;
        while (i < array.length) {
            if (!array[i].equals(employeeName)) {
                temp = array[i];
                newArray[j] = temp;
                j++;

            }

            i++;
        }


        return newArray;
    }

    public void display(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
