/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trafficlightdemo;

/**
 *
 * @author sUBASHINI
 */
public class YellowLightThread extends Thread {
    @Override
    public void run(){
   
   
   try
   {while(true)
   
   { System.out.println("Yellow Light");
      Thread.sleep(2000);
   }
   
   }catch(InterruptedException e)
   
        { e.printStackTrace();
   }    
}
}
