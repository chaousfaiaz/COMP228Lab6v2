/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab60pkg;

/**
 *
 * @author faiaz
 */
//created account class
public class Account {
    private double balance;

    //constructor for instantiating an account
    public Account(double balance)
    {
        this.balance = balance;
    }

    //getter for the balance property
    public double getBalance() {
        return balance;
    }

    //synchronized deposit and withdrawal methods to update balance
    public synchronized void Deposit(double amount)
    {
        this.balance += amount;
    }

    public synchronized void Withdraw(double amount)
    {
        this.balance -= amount;
    }
}
