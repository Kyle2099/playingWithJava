package com.trilogy;

public class Square implements Shape {

    double length;

    public Square(double length) {

        this.length = length;
    }


    @Override
    public double perimeter() {
        double perimeter = length * 4;
        System.out.println("The perimeter of the square is " + perimeter);
        return perimeter;
    }

    @Override
    public double area() {
        double area = length * length;
        System.out.println("The are of the square is " + area);
        return area;
    }
}
