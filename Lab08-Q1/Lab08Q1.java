

package com.mycompany.lab08q1;


public class Lab08Q1 {

    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
        s1.setbalance(20000000);
     s1.calculateInterest();
     
     CheckingAccount c1=new CheckingAccount();
     c1.setbalance(1000000);
     c1.calculateInterest();
    }
}
