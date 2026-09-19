package org.example;

import java.util.Scanner;

public class ElecticityBillCalculatorUserInterface {
    static void main() {
        Scanner scanner =  new Scanner(System.in);

        String name =" ";
        int meterNumber = 0;
        int numberOfUnits = 0;
        int choice = 0;



        while (choice != 4){

            System.out.println("1: Enter customer information ");
            System.out.println("2: Calculate the electricity bill");
            System.out.println("3: View customer information");
            System.out.println("4: Exit the program");
            System.out.println();
            System.out.println("Enter choice: ");
             choice = scanner.nextInt();

            switch (choice){
                ElecticityBillCalculator electicityBillCalculatorcalculator = new ElecticityBillCalculator(name,meterNumber,numberOfUnits);

                case 1:
                    System.out.println("Enter your name: ");
                    name = scanner.next();

                    System.out.println("Enter your meter number: ");
                    meterNumber = scanner.nextInt();

                    System.out.println("How many unit do you want to buy ?");
                    numberOfUnits = scanner.nextInt();

                    electicityBillCalculatorcalculator.setName(name);
                    electicityBillCalculatorcalculator.setMeterNumber(meterNumber);
                    electicityBillCalculatorcalculator.setNumberOfElectricityUnits(numberOfUnits);

                break;

                case 2:
                    electicityBillCalculatorcalculator.calculateBills();
                break;

                case 3:
                    electicityBillCalculatorcalculator.viewCustomerInformation();
                break;

                case 4:
                    System.out.println("Thanks for coming and visit us next time 😁");
                break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }
}
