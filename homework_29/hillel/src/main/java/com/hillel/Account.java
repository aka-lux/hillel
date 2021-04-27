package com.hillel;

public class Account {
    private int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public synchronized void  addFunds(int amount){
        balance += amount;
    }

    public synchronized void withdrawFunds(int amount){
        balance -= amount;
    }

}
