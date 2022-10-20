package com.employee.company;
import java.util.Random;
public class EmployeeAttendance {
    public static void main(String[] args) {
        int WagePerHour = 20;
        int FullDayHour = 8;
        int HalfDayHour = 4;
        int TotalWage = 0;
        System.out.println("Welcome to Employee Wage Computation");

        int randomCheck = new Random(3).nextInt();
        switch (randomCheck){
            case 0: System.out.println("Employee is absent.");
                break;
            case 1: System.out.println("Employee is present.");
                TotalWage = WagePerHour * FullDayHour;
                break;
            case 2: System.out.println("Employee is present for the half day.");
                TotalWage = WagePerHour * HalfDayHour;
                break;
        }
        System.out.println("Employee Salary is: "+TotalWage);
        }

}
