package org.example;

//*******************************
// Sphere.java
//
// Represents a sphere.
//*******************************
public  class Sphere extends Shape
{
    //---------------------------------
    // Constructor: Sets up the sphere.
    //---------------------------------
    private double radius; //radius in feet

    public Sphere (double r)
    {
        super("Sphere");
        radius= r;
    }
    // Returns the surface area of the sphere.
    public double area()
    {
        return 4*Math. PI*radius* radius;
    }

    public  String toString()
    {
        return  super.toString() + " of radius " + radius;
    }
}
