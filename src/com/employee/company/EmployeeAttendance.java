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

        if (randomCheck == 0) {
            System.out.println("Employee is absent");
        }
        else if(randomCheck == 1){
            TotalWage = WagePerHour * FullDayHour;
            System.out.println("Employee is present");
            System.out.println(TotalWage);
        }
        else{
            TotalWage = WagePerHour * HalfDayHour;
            System.out.println("Employee is present for the half day.");
            System.out.println(TotalWage);
        }
    }
}
