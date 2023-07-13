/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptionlab;
import java.util.Scanner;
/**
 *
 * @author sUBASHINI
 */
public class Exceptionlab {

    public static void main(String[] args) {
        int  no1,no2,ans;
        Scanner sc= new Scanner(System.in);
        
        try
        {System.out.println("Enter First number");
        no1=Integer.parseInt(sc.nextLine());
            System.out.println("Enter second number");
            no2=Integer.parseInt(sc.nextLine());
            ans=no1/no2;
            System.out.println("Answer is:"+ans);
       }
        catch(ArithmeticException e)
        {System.out.println("Divide by zero error");
        }
    }
}
