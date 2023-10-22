package org.example;

public class Executive extends Employee {
    private double bonus = 0.0;

    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }

    public void awardBonus(double execBonus) {
        this.bonus = execBonus;
    }

    public double pay() {
        double payment = super.pay() + this.bonus;
        this.bonus = 0.0;
        return payment;
    }
}
