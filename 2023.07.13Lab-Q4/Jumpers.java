/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainmov;

/**
 *
 * @author sUBASHINI
 */
public class Jumpers extends Player {
    
  public Jumpers(int i){
    super(i);
}
  public void CrouchDown(){
      System.out.println("Player moved Down by "+(this.sp-3)+" spaces.");
  }
  
  public void CrouchUp(){
      System.out.println("Player moved Down by "+(this.sp-3)+" spaces.");
}
}