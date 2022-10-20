package com.employee.company;
import java.util.Random;
public class EmployeeAttendance {
    public static void main(String[] args) {
        int WagePerHour = 20;
        int FullDayHour = 8;
        int TotalWage = 0;
        System.out.println("Welcome to Employee Wage Computation");

        int randomCheck = new Random(2).nextInt();

        if (randomCheck == 0) {
            System.out.println("Employee is absent");
        }
        else {
            TotalWage = WagePerHour * FullDayHour;
            System.out.println("Employee is present");
            System.out.println(TotalWage);
        }
    }
}
