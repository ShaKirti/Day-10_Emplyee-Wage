package com.employee.company;
import java.util.Random;
public class EmployeeAttendance {
    int isPartTime = 1;
    int isFullTime = 2;

    int computeEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth) {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0:
                    empHrs = 8;
                    break;
                case 1:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emp Wage for " + company + " is : " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeAttendance emp = new EmployeeAttendance();
        System.out.println("Welcome to the Employee Wage Computation Calculation");
        emp.computeEmpWage("Microsoft", 20, 20, 100);
        emp.computeEmpWage("Tata", 25, 18, 100);
        emp.computeEmpWage("Hyundai", 25, 18, 100);
        emp.computeEmpWage("Pyramid Consulting", 25, 18, 100);
    }
}
