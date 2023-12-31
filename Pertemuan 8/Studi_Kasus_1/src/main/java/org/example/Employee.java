package org.example;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        this.socialSecurityNumber = socSecNumber;
        this.payRate = rate;
    }

    public String toString() {
        String result = super.toString();
        result = result + "\nSocial Security Number: " + this.socialSecurityNumber;
        return result;
    }

    public double pay() {
        return this.payRate;
    }
}
