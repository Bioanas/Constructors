package com.ia;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BankAccount {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount (){
        this ("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount (String number, double balance, String name, String email, String phoneNumber){
        System.out.println("Account constructor with parametres called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void deposit (double depositAmount){
       this.balance += depositAmount;
        System.out.println("Deposit of" + depositAmount + " made. New balance is "  + balance);
    }

    public void withdrawal (double withdrawalAmount){
        if(this.balance - withdrawalAmount<=0){
            System.out.println("Only " + this.balance + "available.Withdrawal not prcessed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println ("Withdrawal of " + withdrawalAmount + "processed. Remaining balance =" + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
