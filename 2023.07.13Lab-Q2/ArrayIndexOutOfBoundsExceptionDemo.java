/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayindexoutofboundsexceptiondemo;

/**
 *
 * @author sUBASHINI
 */
public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
       
     
       int[] numbers={1,2,3,4,5};
       
      try
      {int value=numbers[10];
          System.out.println("The value is:"+value);
    }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println("Error: Array index is out of bounds.");  
      }catch(Exception e){
          System.out.println("e.getMessage()");
      }
      finally{
          for (int i=0;i<numbers.length;i++){
              System.out.println(numbers[i]+"");
          }
      }
    }

    }