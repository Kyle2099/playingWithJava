package com.trilogy;

public class Main {

    public static void main(String[] args) {

        System.out.println("Circle");

        System.out.println("_____________________________");

        Circle myCircle = new Circle(44);
        myCircle.area();
        myCircle.perimeter();


        System.out.println("Square");

        System.out.println("_____________________________");

        Square mySquare = new Square(44);
        mySquare.area();
        mySquare.perimeter();

        System.out.println("_____________________________");


        Triangle myTriangle = new Triangle(55, 23);
        myTriangle.area();
        myTriangle.perimeter();


    }
}
