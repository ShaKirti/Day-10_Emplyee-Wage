package com.employee.company;
import java.util.Random;
public class EmployeeAttendance {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int randomCheck = new Random(2).nextInt();

        if (randomCheck == 0) {
            System.out.println("Employee is absent");
        }
        else {
            System.out.println("Employee is present");
        }
    }
}
