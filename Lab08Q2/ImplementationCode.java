

package com.mycompany.implementationcode;
public class ImplementationCode {

    public static void main(String[] args) {
        Circle c1=new Circle(3.5);
        c1.setradius(3.5);
        c1.calculateArea();
        c1.calculatePerimeter();
        
        Rectangle r1=new Rectangle(5,4);
        r1.setlength(5);
        r1.setwidth(4);
        r1.calculateArea();
        r1.calculatePerimeter();
        
      Triangle t1=new Triangle(6.5,7.5,2,4);
        t1.setbase(6.5);
        t1.setperpendicularheight(7.5);
        t1.setsideA(2);
        t1.setsideB(4);
        t1.calculateArea();
        t1.calculatePerimeter();
        
        
    }
}
