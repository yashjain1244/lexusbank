package com.lexus.bank.application.utilityclasses;

import com.lexus.bank.abstractclasses.subclass.CurrentAccount;
import java.util.Scanner;

public class CurrentAccountUtility {
    private CurrentAccountUtility(){}

    public static void currentAccountBanking(CurrentAccount currentAccount){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            choice = printMenu(scanner);
            switch (choice){
                case 1 -> {
                    System.out.println("How much Money your want to Deposit :- ");
                    currentAccount.depositMoney(scanner.nextInt());
                    CurrentAccountUtility.currentAccountBalance(currentAccount);
                }
                case 2 -> {
                    System.out.println("How much Money you want to Withdraw :- ");
                    currentAccount.withdrawMoney(scanner.nextInt());
                    CurrentAccountUtility.currentAccountBalance(currentAccount);
                }
                case 3 -> CurrentAccountUtility.currentAccountBalance(currentAccount);
                case 4 -> System.out.println("Your Available Credit Limit :- " +
                        currentAccount.getCreditLimit() + "/- Rs.");
                case 0 -> System.out.println("Transaction Cancelled...");
                default -> System.out.println("Invalid Input. Please Try Again.");
            }
        }while (choice!=0 && choice!=3 && choice!=4);

    }

    private static int printMenu(Scanner scanner){
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Account Balance");
        System.out.println("4. Check Credit Limit");
        System.out.println("0. Cancel the Transaction");
        return scanner.nextInt();
    }
    private static void currentAccountBalance(CurrentAccount currentAccount){
        System.out.println("Your Available Account Balance :- " +
                currentAccount.getAccountBalance()+"/- Rs.");
    }
}
