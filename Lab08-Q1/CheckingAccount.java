
package com.mycompany.lab08q1;


public class CheckingAccount extends BankAccount{
    @Override
    void calculateInterest()
    {System.out.println("The interest for Checking account is:"+getbalance()*0.02f);
    }
}
