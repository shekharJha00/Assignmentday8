package com.bridgelabz.empwage;

public class EmployeeWageComputationBuilder {
    private int ignoredI;

    public EmployeeWageComputationBuilder setIgnoredI(int ignoredI) {
        this.ignoredI = ignoredI;
        return this;
    }

    public EmployeeWageComputation createEmployeeWageComputation() {
        return new EmployeeWageComputation(ignoredI);
    }
}