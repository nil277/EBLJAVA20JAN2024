package com.wecp.progressive.entity;

import java.util.*;

public class Accounts implements Comparable<Accounts>,Comparator<Accounts>{
    private int accountId;
    private int customerId;
    private double balance;
    public Accounts() {
    }
    public Accounts(int accountId, int customerId, double balance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    @Override
    public String toString() {
        return "Accounts [accountId=" + accountId + ", customerId=" + customerId + ", balance=" + balance + "]";
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public int compareTo(Accounts o) {
        // TODO Auto-generated method stub
        return Double.compare(this.balance, o.getBalance());
    }
    @Override
    public int compare(Accounts arg0, Accounts arg1) {
        // TODO Auto-generated method stub
        return arg0.accountId - arg1.accountId;
    }
    
}
