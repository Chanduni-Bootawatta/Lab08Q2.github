
package com.mycompany.v1;


public abstract class Container {
    public double  radius;
    public double height;
    public double Volume;
     public abstract  double calculateVolume();
     {
     }
     public void setHeight(double height)
     { this.height=height;
     }
     public void setRadius(double radius)
     { this.radius=radius;
     
     }
     public double getHeight()
     { return height;
     
     }
     public double getRadius()
     { return radius;
    }
}
