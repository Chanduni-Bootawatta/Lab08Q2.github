
package com.mycompany.implementationcode;


public class Circle implements Shape{
    protected double radius;
    
    public Circle(double radius)
    { this.radius=radius;
    }
    
   public double getradius()
   {
   return radius;
   }
    public void setradius(double r)
    {radius=r;
    }
    
  @Override
  public void calculateArea()
    {System.out.println("The Area of the Circle is:"+3.14f*getradius()*getradius());
    }

    @Override
    public void calculatePerimeter() 
    {
        System.out.println("The Perimeter of the Circle is:"+2*3.14f*getradius());
    }
   
 }
