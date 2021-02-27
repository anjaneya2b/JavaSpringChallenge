package com.mindex.challenge.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Compensation {
    @Id
    private String CompensationId;
    private Employee employee;
    private int salary;
    private String effectiveDate;
    @Transient
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

    public Compensation() {
    }

    public String getCompensationId() {
        return CompensationId;
    }

    public void setCompensationId(String compensationId) {
        CompensationId = compensationId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) throws ParseException {
        this.effectiveDate = dateFormat.parse(effectiveDate).toString();
    }
}
