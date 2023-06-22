
package com.mycompany.lab08q1;


abstract class BankAccount {
    
    private int accountNumber;
    private double balance;
    
    
    public int getaccountnumber()
    {return accountNumber;
    }
    
    public void setaccountnumber(int a)
    {accountNumber=a;
    }
    
    public double getbalance()
    {return balance;
    }
    
    public void setbalance(int b)
    { balance=b;
    }
    void calculateInterest()
    {
    }
    
}
