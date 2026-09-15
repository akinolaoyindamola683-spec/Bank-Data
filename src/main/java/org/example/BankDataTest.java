package org.example;

import java.util.Scanner;

public class BankDataTest {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        BankData account = new BankData(" Mariam", 10000.0);

        int choice = 0;

        while(choice != 5){

            System.out.println("\n===== BANK APP =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    account.chekBalance();
                break;

                case 2:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextInt();

                    account.deposit(depositAmount);
                break;

                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawel = scanner.nextInt();

                    account.withdraw(withdrawel);
                break;

                case 4:
                    System.out.println("Enter transfer amount: ");
                    double transferAmount = scanner.nextInt();

                    account.transfer(transferAmount);
                break;
                case 5:
                    System.out.println("Thanks for using my Bank App 😊");
                break;

                default:
                    System.out.println("Invalid choice please enter 1-5");
            }
        }
    }
}
