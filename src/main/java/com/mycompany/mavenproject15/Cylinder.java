package com.mycompany.mavenproject15;

//Class Definition
public class Cylinder {

//    Attributes
    double radius;
    double height;

//    Methods
//    Constructors
    Cylinder() {
        this.height = 0.0;
        this.radius = 0.0;
        System.out.println("A cylinderical object has been created with height " + height + " and radius" + radius);
    }

    Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        System.out.println("A cylinderical object has been created with height " + height + " and radius" + radius);
        calculations();
    }

    public double calculations() {
        double surfaceArea = 2 * 3.14 * height * radius;
        double volume = 3.14 * (radius * radius) * height;
        System.out.println("Surface Area = " + surfaceArea);
        System.out.println("Volume = " + volume);
        return 0;
    }
}
