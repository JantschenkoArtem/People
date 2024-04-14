package org.example.people.Class;

import org.example.people.ENAM.Currency;

/**
 * Написать класс Account
 * Поля:
 * - валюта счета(энам)
 * - баланс
 * - номер счета
 */
public class Account {
    private Currency currency;
    private double balance;
    private String accountNumber;

    public Account(Currency currency, double balance, String accountNumber) {
        this.currency = currency;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
