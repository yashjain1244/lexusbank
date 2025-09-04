package com.lexus.bank.abstractclasses.subclass;

import com.lexus.bank.abstractclasses.superclass.BankAccount;

public abstract class CurrentAccount extends BankAccount {
    private final float creditLimit;

    protected CurrentAccount(int accountNo, String accountName, float accountBalance, float creditLimit) {
        super(accountNo, accountName, accountBalance);
        this.creditLimit = creditLimit;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void withdrawMoney(float amount) {
        if ((getAccountBalance()+creditLimit)>=amount){
            super.withdrawMoney(amount);
            System.out.println("Transaction Successful.");
            System.out.println();
        }
        else {
            System.out.println("Transaction Failed.");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "creditLimit=" + creditLimit +
                '}'+super.toString();
    }
}
