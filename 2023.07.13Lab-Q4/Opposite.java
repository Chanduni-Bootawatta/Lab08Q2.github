/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainmov;

/**
 *
 * @author sUBASHINI
 */
public class Opposite extends Movement{
      int sp;
   Opposite(int i){
        this.sp=i;
    }
    
    @Override
    public void Up(){
        System.out.println("Player moved Down by "+this.sp+" spaces.");
    }
    
    @Override
    public void Right(){
        
        System.out.println("Player moved Left by "+this.sp+" spaces.");  
    }
    
    @Override
    public void Left(){
        System.out.println("Player moved Right by "+this.sp+" spaces.");
    }
    
    @Override
    public void Down(){
        System.out.println("Player moved Up by "+this.sp+" spaces.");  
    }   
    
}
