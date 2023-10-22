package org.example;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor
    public Commission(String name, String address, String phone, String socSecNumber, double hourlyRate, double commissionRate) {
        super(name, address, phone, socSecNumber, hourlyRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    // Method to add total sales
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Override pay method to calculate pay with commission
    public double pay() {
        double hourlyPayment = super.pay();
        double commissionPayment = totalSales * commissionRate;
        totalSales = 0; // Reset total sales after payment

        return hourlyPayment + commissionPayment;
    }

    // Override toString method to include total sales
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: $" + totalSales;
        return result;
    }
}
