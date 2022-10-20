package com.employee.company;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Employee {

        public static void main(String args[]) {
            System.out.println("Welcome to employee wage computation problem");
            System.out.println("Calculating wages for employees");
            EmployeeBuilder empWageBuilder = new EmployeeBuilder();
            empWageBuilder.addCompanyDetailsForEmpWage("Wipro", 10, 20, 16);
            empWageBuilder.addCompanyDetailsForEmpWage("Reliance Jio", 20, 20, 20);
            empWageBuilder.addCompanyDetailsForEmpWage("MicroLink", 10, 20, 10);
            empWageBuilder.companyEmpWage();
        }
}
