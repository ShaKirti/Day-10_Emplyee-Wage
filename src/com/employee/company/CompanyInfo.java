package com.employee.company;

public class CompanyInfo {
        public final String companyName;
        public final int empRatePerHr;
        public final int numberOfWorkingDays;
        public final int maxWorkingHrsPerMonth;

        public CompanyInfo(String companyName, int empRatePerHr, int numberOfWorkingDays, int maxWorkingHrsPerMonth) {
            super();
            this.companyName = companyName;
            this.empRatePerHr = empRatePerHr;
            this.numberOfWorkingDays = numberOfWorkingDays;
            this.maxWorkingHrsPerMonth = maxWorkingHrsPerMonth;
        }

}
