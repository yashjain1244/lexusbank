package com.lexus.bank.abstractclasses.subclass;

import com.lexus.bank.abstractclasses.superclass.BankAccount;

public abstract class SavingAccount extends BankAccount {
    private boolean isSalaried;
    private static final float MINBAL=10000;

    public SavingAccount(int accountNo, String accountName, float accountBalance, boolean isSalaried) {
        super(accountNo, accountName, accountBalance);
        this.isSalaried = isSalaried;
    }

    public boolean isSalaried() {
        return isSalaried;
    }
    public void setSalaried(boolean salaried) {
        isSalaried = salaried;
    }

    @Override
    public void withdrawMoney(float amount) {
        if ((getAccountBalance()-amount)>MINBAL){
            super.withdrawMoney(amount);
            System.out.println("Transaction Successful.");
        }
        else {
            System.out.println("Transaction Failed.");
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "isSalaried=" + isSalaried +
                '}'+super.toString();
    }



}
