package com.employee.company;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeAttendance {
    ArrayList<Integer> Wage = new ArrayList<Integer>();
    ArrayList<String> companylist = new ArrayList<String>();

    void check() {
        int totalsalary = 0;
        int maxRateInMonth = 100;
        int maxHoursInMonth = 100;
        int totalEmpHr = 0;
        int totalWorkingDays = 0;
        int empHrs = 0;
        int finalsalary = 0;

        System.out.println("Enter your company name ");
        String companyName = new Scanner(System.in).nextLine();
        System.out.println(companyName);
        companylist.add(companyName);

        System.out.println("Enter Employee rate Per hour of your Company :");
        int empRatePerHr1 = new Scanner(System.in).nextInt();

        System.out.println("Enter the Number of working days of your Company:");
        int numOfWorkingDays1 = new Scanner(System.in).nextInt();

        System.out.println("Enter the Number of working hours of your Company:");
        int numOfWorkingHrs1 = new Scanner(System.in).nextInt();

        while (totalEmpHr <= maxRateInMonth && totalWorkingDays <= numOfWorkingDays1
                && numOfWorkingHrs1 <= maxHoursInMonth) {
            totalWorkingDays++;
            double randomCheck = Math.floor(Math.random() * 10) % 3;
            int i = (int) randomCheck;
            switch (i) {
                case 2:
                    empHrs = 8;
                    break;
                case 1:
                    empHrs = 4;
                    break;
                case 0:
                    empHrs = 0;
                    break;
            }

            totalEmpHr = totalEmpHr + empHrs;

        }
        totalsalary = totalEmpHr * empRatePerHr1;
        finalsalary += totalsalary;

        Wage.add(finalsalary);
        System.out.println("Company Names" + companylist); //
        System.out.println("Wages of Months" + Wage);

        }
}


