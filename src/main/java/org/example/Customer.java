package org.example;


public class Customer {
    private String name;
    private int meterNumber;
    private int numberOfElectricityUnits;

    public Customer(String name, int meterNumber, int numberOfElectricityUnits){
        this.name = name;
        this.meterNumber = meterNumber;
        this.numberOfElectricityUnits = numberOfElectricityUnits;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMeterNumber(int meterNumber){
        this.meterNumber =meterNumber;
    }

    public void setNumberOfElectricityUnits(int numberOfElectricityUnits){
        this.numberOfElectricityUnits = numberOfElectricityUnits;
    }

    public String getName(){
        return name;
    }

    public int getMeterNumber(){
        return meterNumber;
    }

    public int getNumberOfElectricityUnits(){
        return numberOfElectricityUnits;
    }


    public void calculateBills(){

        if(getNumberOfElectricityUnits()  < 0) {
            System.out.println("Invalid unit");
            System.out.println();
        }

        if(getNumberOfElectricityUnits() > 0) {
            if (getNumberOfElectricityUnits() <= 50) {
                int total = getNumberOfElectricityUnits() * 20;
                System.out.println("Amount per unit form 0 - 50 : $20");
                System.out.println("Customer unit:  " + getNumberOfElectricityUnits());
                System.out.println("Total amount is: " + total);
                System.out.println();
            }

            if (getNumberOfElectricityUnits() >= 51 && getNumberOfElectricityUnits() <= 100) {
                int total = getNumberOfElectricityUnits() * 30;
                System.out.println("Amount per unit form 51 - 100 : $30");
                System.out.println("Customer unit: " + getNumberOfElectricityUnits());
                System.out.println("Total amount is: " + total);
                System.out.println();
            }

            if (getNumberOfElectricityUnits() >= 101 && getNumberOfElectricityUnits() <= 200) {
                int total = getNumberOfElectricityUnits() * 40;
                System.out.println("Amount per unit form 101 - 200 : $40");
                System.out.println("Customer unit: " + getNumberOfElectricityUnits());
                System.out.println("Total amount is: " + total);
                System.out.println();
            }
            if (getNumberOfElectricityUnits() > 200) {
                int total = getNumberOfElectricityUnits() * 50;
                System.out.println("Amount per unit form 200 above : $50");
                System.out.println("Customer unit: " + getNumberOfElectricityUnits());
                System.out.println("Total amount is: " + total);
                System.out.println();
            }
        }
    }

    public void viewCustomerInformation(){
        System.out.println("Name: " + getName() );
        System.out.println("Meter number: " + getMeterNumber());
        calculateBills();
    }


}
