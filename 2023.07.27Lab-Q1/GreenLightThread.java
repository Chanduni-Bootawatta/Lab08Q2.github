/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trafficlightdemo;

/**
 *
 * @author sUBASHINI
 */
public class GreenLightThread extends Thread {

    /**
     *
     */
    @Override
    public void run()
   {
   {try
   {while(true)
   { 
       System.out.println("Green Light");
       Thread.sleep(10000);
   }
   }catch(InterruptedException e)
   
        { e.printStackTrace();
   }    
}

  
}
}