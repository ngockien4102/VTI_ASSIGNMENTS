package org.example.basic.entity;


public class Account {
    private int accountId;
    private String accountName;

    public Account() {
    }

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
