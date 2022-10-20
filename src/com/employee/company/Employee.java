package com.employee.company;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Employee {
    public static void main(String args[]) {
        System.out.println("Calculating wages for employees");
        System.out.println("Equires for daily wages");

        EmployeeBuilder empWageBuilder = new EmployeeBuilder();

        empWageBuilder.addCompanyDetailsForEmpWage("Dominos", 10, 20, 16);
        empWageBuilder.addCompanyDetailsForEmpWage("BigBe", 20, 20, 20);
        empWageBuilder.addCompanyDetailsForEmpWage("mans", 10, 20, 10);

        empWageBuilder.companyEmpWage();
        empWageBuilder.printEmpWageForCompany();
    }
}
