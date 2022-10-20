package com.employee.company;

import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
//        EmployeeAttendance audi = new EmployeeAttendance(); // creating object for to call method

        System.out.println("How many company data you want to Enter ");
        new Scanner(System.in).toString();
        int noOfCompanys = new Scanner(System.in).nextInt();

        for (int i = 1; i <= noOfCompanys; i++) {

            new EmployeeAttendance().check();
        }
    }
}
