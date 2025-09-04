package com.lexus.bank.application;

import com.lexus.bank.abstractclasses.factory.BankFactory;
import com.lexus.bank.abstractclasses.subclass.CurrentAccount;
import com.lexus.bank.abstractclasses.subclass.SavingAccount;
import com.lexus.bank.concreteclasses.LexusBankFactory;
import com.lexus.bank.application.utilityclasses.CurrentAccountUtility;
import com.lexus.bank.application.utilityclasses.SavingAccountUtility;

import java.util.Scanner;

public class BankInterface {

    private BankInterface(){}

    public static void startBankInterface(){

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            choice=printMenu(scanner);
            switch (choice) {
                case 1 -> {
                    SavingAccount savingAccount = BankInterface.savingAccountCredentials(scanner);
                    System.out.println("Welcome "+savingAccount.getAccountName()+" Sir.");
                    SavingAccountUtility.savingAccountBanking(savingAccount);
                }
                case 2 -> {
                    CurrentAccount currentAccount = BankInterface.currentAccountCredentials(scanner);
                    System.out.println("Welcome "+currentAccount.getAccountName()+" Sir.");
                    CurrentAccountUtility.currentAccountBanking(currentAccount);
                }
                case 0 -> System.out.println("Thank you for Banking with us.");
                default -> System.out.println("Invalid Input. Please Try Again.");
            }
        }while (choice!=0);

    }

    private static int printMenu(Scanner scanner) {
        System.out.println("Welcome to The Lexus Bank LTD.");
        System.out.println("1. Get New Saving Account.");
        System.out.println("2. Get New Current Account.");
        System.out.println("0. Exit...");
        return scanner.nextInt();
    }


    private static SavingAccount savingAccountCredentials(Scanner scanner){
        BankFactory account = new LexusBankFactory();
        System.out.println("Enter Your Credentials. ");
        System.out.print("Account Number :- ");
        int accNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Your Name :- ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("Account Balance :- ");
        float accBal = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Are you Salaried :- ");
        boolean isSal = scanner.nextBoolean();
        return account.getNewSavingsAccount(accNo, name, accBal,isSal);
    }


    private static CurrentAccount currentAccountCredentials(Scanner scanner){
        BankFactory account = new LexusBankFactory();
        System.out.println("Enter Your Credentials. ");
        System.out.print("Account Number :- ");
        int accNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Your Name :- ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("Account Balance :- ");
        float accBal = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Credit Limit :- ");
        int minBal = scanner.nextInt();
        return account.getNewCurrentAccount(accNo, name, accBal, minBal);
    }

}
