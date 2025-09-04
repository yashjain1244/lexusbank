package com.lexus.bank.concreteclasses;

import com.lexus.bank.abstractclasses.subclass.SavingAccount;

public class LexusBankSavingAccount extends SavingAccount {
    private static final float MINBAL = 10000;

    public LexusBankSavingAccount(int accountNo, String accountName, float accountBalance, boolean isSalaried) {
        super(accountNo, accountName, accountBalance, isSalaried);
    }

    @Override
    public void withdrawMoney(float amount) {
        super.withdrawMoney(amount);
    }
    @Override
    public String toString() {
        return "LexusBankSavingAccount{" +
                "MINBAL=" + MINBAL +
                '}'+super.toString();
    }
}
