package com.lexus.bank.abstractclasses.superclass;

public abstract class BankAccount {
    private int accountNo;
    private String accountName;
    private float accountBalance;

    private BankAccount() {
    }
    protected BankAccount(int accountNo, String accountName, float accountBalance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdrawMoney(float amount){
        accountBalance-=amount;
    }
    public void depositMoney(float amount){
        accountBalance+=amount;
        System.out.println("Transaction Successful.");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo=" + accountNo +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
