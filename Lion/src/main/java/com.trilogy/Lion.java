package.com.trilogy;


import java.util.Random;

public class Lion {
    // Here are our class variables. They use the static keyword.
    public static int numberOfLionsCreated = 0;
    public static int lionMaxAge = 0;
    private static int maxNumberOfCubs = 12;

    // Here are our instance variables. There is one copy of these per instance.
    private String sex;
    private int age;
    private String name;
    private boolean hungry;

    // Constructor - This is used to create an instance of a Lion
    public Lion(String sex, int age, String name, boolean hungry) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.hungry = hungry;

        if (age > lionMaxAge) {
            lionMaxAge = age;
        }
        numberOfLionsCreated++;
    }

    // Here is another constructor - it has a different signature
    // (1 parameter, instead of 4)
    public Lion(String name) {
        this.name = name;

        numberOfLionsCreated++;
    }

    // This is a static method. This is accessible from the class and not
    // from an instance
    public static int getMaxNumberOfCubs() {
        return maxNumberOfCubs;
    }

    // Another static method
    public static void setMaxNumberOfCubs(int newMax) {
        maxNumberOfCubs = newMax;
    }

    // This method checks a static (class) variable
    public void haveCubs() {
        if (sex.equals("female")) {
            Random randomNum = new Random();
            int numberOfCubs = randomNum.nextInt(maxNumberOfCubs) + 1;
            System.out.println("Congratulations!  You had " + numberOfCubs + "cubs.");
        }
    }

    // This method also checks a static variable.
    public void haveCubs(int numberOfCubs) {
        if (numberOfCubs > maxNumberOfCubs) {
            System.out.println("You can only have up to " + maxNumberOfCubs);
        } else {
            System.out.println("Congraulations! You had " + numberOfCubs + "cubs");
        }
    }

    public static boolean isLionCreationAvailable() {
        if (numberOfLionsCreated >= 100) {
            return false;
        } else {
            return true;
        }
    }

    // This is a method that is non-static. It is avaiable to every instance
    // of Lion
    public boolean eat(String food) {
        if (food.equals("ant")) {
            hungry = true;
        } else if (food.equals("antelope") && this.hungry == true) {
            hungry = false;
        }
        return hungry;
    }

    public void run(String speed) {
        System.out.println("The lion is running " + speed);
    }

    public void roar() {
        System.out.println("ROOOOOOOOOOAR");
    }

//    public Lion(String sex) {
//        this.sex = sex;
//        this.age = 0;
//        this.name = "Jeff";
//        this.hungry = false;
//    }
//
//    public Lion() {
//        this.sex = "male";
//        this.age = 0;
//        this.name = "Jeff";
//        this.hungry = false;
//    }

    public boolean getHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("male") || sex.equals("female")) {
            this.sex = sex;
        } else {
            System.out.println("Please use male or female to set sex");
        }

//        if (!sex.equals("male") && !sex.equals("female")) {
//            System.out.println("Please use male or female to set sex");
//        } else {
//            this.sex = sex;
//        }
    }

    public int getAge() {
        return age;
    }

    // Note that this setter also updates a static variable (on the class)
    public void setAge(int age) {
        this.age = age;

        if (age > lionMaxAge) {
            lionMaxAge = age;
        }
    }

    public String getName() {
        return name;
    }

}