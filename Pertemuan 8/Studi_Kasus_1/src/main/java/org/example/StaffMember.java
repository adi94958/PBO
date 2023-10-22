package org.example;

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String eName, String eAddress, String ePhone) {
        this.name = eName;
        this.address = eAddress;
        this.phone = ePhone;
    }

    public String toString() {
        String result = "Name: " + this.name + "\n";
        result = result + "Address: " + this.address + "\n";
        result = result + "Phone: " + this.phone;
        return result;
    }

    public abstract double pay();
}
