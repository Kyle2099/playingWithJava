package com.trilogy;

public class Circle implements Shape {

    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public double perimeter() {
        double perimeter = radius * 2 * Math.PI;
        System.out.println("The perimeter of the circle is " + perimeter);
        return perimeter;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);
        return area;
    }
}


