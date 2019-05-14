public class Lion {
    public static int numberOfLionsCreated = 0;
    public static int lionMaxAge = 0;
    private static int maxNumberOfCubs = 12;

    private String sex;
    private int age;
    private String name;
    private boolean hungry;

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

    public Lion(String name) {
        this.name = name;

        numberOfLionsCreated++;
    }

    public static boolean isLionCreationAvailable() {
        if (numberOfLionsCreated >= 100) {
            return false;
        } else {
            return true;
        }
    }


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

    public void setAge(int age) {
        this.age = age;

        if (age > lionMaxAge) {
            lionMaxAge = age;
            numberOfLionsCreated++;
        }
    }

    public static int getMaxNumberOfCubs() {
        return maxNumberOfCubs;
    }

    public static void setMaxNumberOfCubs(int newMax) {
        maxNumberOfCubs = newMax;
    }

    public void haveCubs() {
        if(sex.equals("female")) {
            Random randomNum = new random();
            int numberOfCubs = randomNum.nextInt(maxNumberOfCubs) + 1;
            System.out.println("CONGRATULATIONS! You had " + numberOfCubs + "cubs");
        }
    }

    public void haveCubs(int numberOfCubs) {
        if (numberOfCubs > maxNumberOfCubs) {
            System.out.println("You can only have up to " + maxNumberOfCubs);
        } else {
            System.out.println("Congraulations! you had " + numberOfCubs + "cubs");
        }
    }

    public String getName() {
        return name;
    }

}