
package com.mycompany.lab08q1;


public class SavingsAccount extends BankAccount {
    @Override
    void calculateInterest()
    {
        System.out.println("The intereset for saving account is:"+getbalance()*0.12f);
    }
    
}
