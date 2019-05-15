package com.trilogy;

public class Triangle implements Shape {

    double hypotenuse;
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;

    }


    @Override
    public double perimeter() {
        double perimeter = hypotenuse + base + height;
        System.out.println("The perimeter of the triangle is " + perimeter);
        return perimeter;
    }

    @Override
    public double area() {
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is " + area);
        return area;
    }
}





