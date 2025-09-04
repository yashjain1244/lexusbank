package com.lexus.bank.concreteclasses;

import com.lexus.bank.abstractclasses.factory.BankFactory;

public class LexusBankFactory extends BankFactory {
    @Override
    public LexusBankSavingAccount getNewSavingsAccount(int accountNo, String accountName,
                                                       float accountBalance, boolean isSalaried){
        return new LexusBankSavingAccount(accountNo, accountName, accountBalance, isSalaried);
    }
    @Override
    public LexusBankCurrentAccount getNewCurrentAccount (int accountNo, String accountName,
                                                        float accountBalance, float creditLimit){
        return new LexusBankCurrentAccount(accountNo, accountName, accountBalance, creditLimit);
    }
}
