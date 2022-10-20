package com.employee.company;

import java.util.ArrayList;

public class EmployeeBuilder {
    final static int IS_FULL_TIME = 1;
    final static int IS_PART_TIME = 2;
    // instance variables
    ArrayList<CompanyInfo> companyList = new ArrayList<CompanyInfo>();
    
    public void addCompanyDetailsForEmpWage(String companyName, int empRatePerHr, int numnberOfWorkingDays,
                                            int maxWorkingHrsPerMonth) {
        CompanyInfo company = new CompanyInfo(companyName, empRatePerHr, numnberOfWorkingDays, maxWorkingHrsPerMonth);
        companyList.add(company);
    }

    public void companyEmpWage() {
        for (int i = 0; i < companyList.size(); i++) {
            empWgaeComputation(this.companyList.get(i));
            System.out.println(this.companyList.get(i).toString());
        }
    }

    public int getEmpHrs() {
        int empHrs;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        return empHrs;
    }

    public void empWgaeComputation(CompanyInfo company) {
        int days = 0;
        int totalWorkingHrs = 0;
        while (days < company.numberOfWorkingDays && totalWorkingHrs <= company.maxWorkingHrsPerMonth) {
            days++;
            int empHrs = this.getEmpHrs();
            totalWorkingHrs += empHrs;
            company.dailyWage[days] = empHrs * company.empRatePerHr;
        }
        company.totalEmpWage = totalWorkingHrs * company.empRatePerHr;
    }

}
