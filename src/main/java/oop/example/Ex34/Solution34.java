package oop.example.Ex34;

import java.util.Scanner;

public class Solution34 {
    private static final Scanner scanner = new Scanner(System.in);
    private static  String employeeName;
    private static  String[] employeeArray ={"John Smith","Jackie Jackson","Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.display(employeeArray);


        readUserInput();
        employeeArray=employee.remove(employeeName,employeeArray);
        employee.display(employeeArray);

    }

    private static void readUserInput() {
        System.out.println("Enter an employee name to remove:");
        employeeName = scanner.nextLine();
    }
}
