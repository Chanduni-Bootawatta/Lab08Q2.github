
package com.mycompany.implementationcode;


public class Rectangle implements Shape
{protected double length;
 protected double width;
    
    public Rectangle(double length,double width)
    { this.length=length;
     this.width=width;
    }
    
   public double getlength()
   {
   return length;
   }
    public void setlength(double l)
    {length=l;
    }
    
    public double getwidth()
   {
   return width;
   }
    public void setwidth(double w)
    {width=w;
    }
    
  @Override
  public void calculateArea()
    {System.out.println("The Area of the Rectangle is:"+getlength()*getwidth());
    }

    @Override
    public void calculatePerimeter() 
    { double Perimeter;
            Perimeter= 2*(length+width);
        System.out.println("The Perimeter of the Rectangle is:"+Perimeter);
    }
   
 }

    

