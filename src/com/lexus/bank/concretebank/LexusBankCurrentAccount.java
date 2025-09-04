package com.lexus.bank.concretebank;

import com.lexus.bank.abstractclasses.subclass.CurrentAccount;

public class LexusBankCurrentAccount extends CurrentAccount {
    public LexusBankCurrentAccount(int accountNo, String accountName, float accountBalance, float creditLimit){
        super(accountNo,accountName,accountBalance,creditLimit);
    }

    @Override
    public void withdrawMoney(float amount) {
        super.withdrawMoney(amount);
    }

    @Override
    public String toString() {
        return "LexusBankCurrentAccount{" + super.toString()+ "}";
    }
}
