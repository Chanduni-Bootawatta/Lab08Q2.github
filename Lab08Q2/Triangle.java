
package com.mycompany.implementationcode;


public class Triangle implements Shape
{protected double base;
 protected double perpendicularheight;
 protected double sideA;
 protected double sideB;
    
    public Triangle(double base,double perpendicularheight,double sideA,double sideB)
    { this.base=base;
     this.perpendicularheight=perpendicularheight;
     this.sideA=sideA;
     this.sideB=sideB;
    }
    
   public double getbase()
   {
   return base;
   }
    public void setbase(double b)
    {base=b;
    }
    
    public double getperpendicularheight()
   {
   return perpendicularheight;
   }
    public void setperpendicularheight(double ph)
    {perpendicularheight=ph;
    }
    public double getsideA()
   {
   return sideA;
   }
    public void setsideA(double A)
    {sideA=A;
    }
    public double getsideB()
   {
   return sideB;
   }
    public void setsideB(double B)
    {sideB=B;
    }
    
  @Override
  public void calculateArea()
    {System.out.println("The Area of the Triangle is:"+0.5f*getbase()*getperpendicularheight());
    }

    @Override
    public void calculatePerimeter() 
    { double Perimeter;
      Perimeter=sideA+sideB+base;
        System.out.println("The Perimeter of the Triangle is:"+Perimeter);
    }
   
 }

  
