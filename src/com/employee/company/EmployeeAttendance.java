package com.employee.company;
import java.util.Random;
public class EmployeeAttendance {
    public static void main(String args[]){
        System.out.println("Welcome to Employee Wage Computation Program.");

        int WagePerHour = 20;
        int FullDayHour = 8;
        int HalfDayHour = 4;
        int WorkingDayPerMonth = 20;
        int monthlySalary = 0;
        int TotalWage = 0;
        int WorkingHourPerMonth = 0;
        int days = 1;
        
        int randomCheck = new Random().nextInt(3);

        while (days != 20 && WorkingHourPerMonth != 100) {
            switch (randomCheck) {
                case 0:
                    System.out.println("Employee is absent.");
                    break;
                case 1:
                    System.out.println("Employee is present.");
                    TotalWage = WagePerHour * FullDayHour;
                    break;
                case 2:
                    System.out.println("Employee is present for the half day.");
                    TotalWage = WagePerHour * HalfDayHour;
                    break;
            }
            monthlySalary += TotalWage;
            System.out.println("Day " + days + " : " + TotalWage);
            days++;
        }
        System.out.println("Employee Monthly Salary is: "+monthlySalary);
    }
}
