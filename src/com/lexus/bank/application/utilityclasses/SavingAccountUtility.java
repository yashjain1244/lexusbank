package com.lexus.bank.application.utilityclasses;

import com.lexus.bank.abstractclasses.subclass.SavingAccount;

import java.util.Scanner;

public class SavingAccountUtility {

    private SavingAccountUtility(){}

    public static void savingAccountBanking(SavingAccount savingAccount){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            choice = printMenu(scanner);
            switch (choice){
                case 1 -> {
                    System.out.println("How much Money your want to Deposit :- ");
                    savingAccount.depositMoney(scanner.nextInt());
                    SavingAccountUtility.SavingAccountBalance(savingAccount);
                }
                case 2 -> {
                    System.out.println("How much Money you want to Withdraw :- ");
                    savingAccount.withdrawMoney(scanner.nextInt());
                    SavingAccountUtility.SavingAccountBalance(savingAccount);
                }
                case 3 -> SavingAccountUtility.SavingAccountBalance(savingAccount);
                case 0 -> System.out.println("Transaction Cancelled...");
                default -> System.out.println("Invalid Input. Please Try Again.");
            }
        }while (choice!=0 && choice!=3);

    }

    private static int printMenu(Scanner scanner){
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Account Balance");
        System.out.println("0. Cancel the Transaction");
        return scanner.nextInt();
    }

    private static void SavingAccountBalance(SavingAccount savingAccount){
        System.out.println("Your Available Account Balance :- " +
                savingAccount.getAccountBalance()+"/- Rs.");
        System.out.println();
    }
}
