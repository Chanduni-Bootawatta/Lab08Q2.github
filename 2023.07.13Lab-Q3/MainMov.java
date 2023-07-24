/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainmov;

/**
 *
 * @author sUBASHINI
 */
public class MainMov {

    public static void main(String[] args) {
      Player p1=new Player(1);
      p1.Up();
      p1.Down();
      p1.Right();
      p1.Left();
      
      Jumpers j1=new Jumpers(5);
      j1.Up();
      j1.Down();
      j1.Right();
      j1.Left();
      
      Opposite o1=new Opposite(2);
      o1.Up();
      o1.Down();
      o1.Right();
      o1.Left();
      
      
      
    }
}
