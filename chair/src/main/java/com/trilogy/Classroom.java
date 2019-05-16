package com.trilogy;

public class Classroom {
    public static void main(String[] args) {
        Location chairLocation = new Location(10,20);

        Chair johnsChair = new Chair("red", 60, false, chairLocation);
        Chair nurgulsChair = new Chair("pink", johnsChair.getHeight(), true, chairLocation);
        Chair ghazisChair = johnsChair;

        System.out.println("INITIALLY");
        System.out.println("The location of John's chair is " + johnsChair.getLocationOfTheChair().toString());
        System.out.println(" " + johnsChair.getLocationOfTheChair().getLatitude());
        System.out.println("The location of Nurgul's chair is " + nurgulsChair.getLocationOfTheChair().toString());
        System.out.println("The color of John's chair is " + johnsChair.getColor());
        System.out.println("The color of Nurgul's chair is " + nurgulsChair.getColor());

        System.out.println("-------------------------------------------------");
        System.out.println("Moving the location of Nurgul's chair to latitude 30");
        nurgulsChair.getLocationOfTheChair().setLatitude(30);
        System.out.println("The location of John's chair is " + johnsChair.getLocationOfTheChair().toString());
        System.out.println("The location of Nurgul's chair is " + nurgulsChair.getLocationOfTheChair().toString());
        System.out.println("The color of John's chair is " + johnsChair.getColor());
        System.out.println("The color of Nurgul's chair is " + nurgulsChair.getColor());

        System.out.println("-------------------------------------------------");
        System.out.println("Change the color of Nurgul's chair to blue");
        nurgulsChair.setColor("blue");
        System.out.println("The location of John's chair is " + johnsChair.getLocationOfTheChair().toString());
        System.out.println("The location of Nurgul's chair is " + nurgulsChair.getLocationOfTheChair().toString());
        System.out.println("The color of John's chair is " + johnsChair.getColor());
        System.out.println("The color of Nurgul's chair is " + nurgulsChair.getColor());

        System.out.println("-------------------------------------------------");
        System.out.println("Make a new location for John's chair");
        johnsChair.setLocationOfTheChair(new Location(67, 89));
        System.out.println("The location of John's chair is " + johnsChair.getLocationOfTheChair().toString());
        System.out.println("The location of Nurgul's chair is " + nurgulsChair.getLocationOfTheChair().toString());
        System.out.println("The color of John's chair is " + johnsChair.getColor());
        System.out.println("The color of Nurgul's chair is " + nurgulsChair.getColor());

        Location anotherLocation = johnsChair.getLocationOfTheChair();

        System.out.println("anotherLocation is " + anotherLocation.toString());

        System.out.println("----------------");
        System.out.println("Let's roll Nurgul's chair. Hot pursuit!");
        nurgulsChair.startRolling();

        System.out.println("The max speed of Johns's chair is " + johnsChair.getMaxRollingSpeed());
//        System.out.println("Before recline: State of johns chair " + johnsChair.getHeight() + " " + johnsChair.isReclined());
//        johnsChair.recline();
//        System.out.println("After recline: State of johns chair " + johnsChair.getHeight() + " " + johnsChair.isReclined());
//        johnsChair.setHeight(johnsChair.getHeight() * 2);
//        System.out.println("After height change: State of johns chair " + johnsChair.getHeight() + " " + johnsChair.isReclined());
//
//        Chair nurgulsChair = new Chair("pink", johnsChair.getHeight(), true);
//        System.out.println("Before color setting: State of nurguls chair " + nurgulsChair.getColor());
//        nurgulsChair.setColor("superpink");
//        System.out.println("After color setting: State of nurguls chair " + nurgulsChair.getColor());
//
//        System.out.println("-----------------------------");
//        System.out.println("(Before) Height of John's chair is " + johnsChair.getHeight() + ", height of Nurgul's chair " + nurgulsChair.getHeight());
//        System.out.println("Changing the height of Johns's chair");
//        johnsChair.setHeight(25);
//        System.out.println("(After) Height of John's chair is " + johnsChair.getHeight() + ", height of Nurgul's chair " + nurgulsChair.getHeight());

    }
}