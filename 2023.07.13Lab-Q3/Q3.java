/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q3;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author sUBASHINI
 */
public class Q3 {

    public static void main(String[] args) {
        try
        { File file= new File("nonexistent.txt");
        Scanner sc= new Scanner(file);
        while(sc.hasNextLine()){
            
            String line= sc.nextLine();
            System.out.println("line");
        } sc.close();
        }catch(FileNotFoundException e){
            System.out.println("Error:File not found!");
        }
    }
}
