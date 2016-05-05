package com.upao.ejercicio1;

/**
 *
 * @author Cesar
 */
public class Account 
{
    public static final int DEFAULT_ACCOUNTNUMBER=1334;
    public static final double DEFAUL_BALANCE=0.0;
    
    private int accountnumber;
    private double balance;
    
    
    public Account()
    {
        this.accountnumber=DEFAULT_ACCOUNTNUMBER;
        this.balance=DEFAUL_BALANCE;
    }
    public Account(int accountnumber, double balance) 
    {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountnumber=" + accountnumber + ", balance=" + balance + '}';
    }
    
    
}
