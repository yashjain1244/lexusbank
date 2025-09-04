package com.lexus.bank.abstractclasses.factory;

import com.lexus.bank.abstractclasses.subclass.CurrentAccount;
import com.lexus.bank.abstractclasses.subclass.SavingAccount;

public abstract class BankFactory {
    public abstract SavingAccount getNewSavingsAccount(int accountNo, String accountName,
                                              float accountBalance, boolean isSalaried);

    public abstract CurrentAccount getNewCurrentAccount(int accountNo, String accountName,
                                               float accountBalance, float creditLimit);

}
