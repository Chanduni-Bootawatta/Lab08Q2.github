/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trafficlightdemo;

/**
 *
 * @author sUBASHINI
 */
public class TrafficlightDemo {

    public static void main(String[] args) {
       RedLightThread r1= new RedLightThread();
       GreenLightThread t1= new GreenLightThread();
       YellowLightThread y1= new YellowLightThread();
       
       Thread obj1= new Thread(r1);
         Thread obj2= new Thread(t1);
           Thread obj3= new Thread(y1);
      obj1.start();
      obj2.start();
      obj3.start();
       
       
    }
}
