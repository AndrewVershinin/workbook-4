package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private boolean hasPunchedIn = false;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        return (hoursWorked <= 40) ? hoursWorked : 40;
    }

    public double getOvertimeHours() {
        return (hoursWorked > 40) ? (hoursWorked - 40) : 0;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }

    public void punchIn(double time) {
        if (!hasPunchedIn) {
            startTime = time;
            hasPunchedIn = true;
        }
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        punchIn(time);
        System.out.println(name + " punched in at " + String.format("%.2f", time));
    }

    public void punchOut(double time) {
        if (hasPunchedIn) {
            double worked = time - startTime;
            if (worked > 0) {
                hoursWorked += worked;
                System.out.println(name + " punched out at " + time + ". Worked " + worked + " hours.");
            }
            hasPunchedIn = false;
        }
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        punchOut(time);
        System.out.println(name + " punched out at " + String.format("%.2f", time));
    }
}
