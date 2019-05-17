package com.trilogy.inheritance;

public class Developer extends StaffMember {
    protected String name;
    private int age;

//    public Developer() {
//        System.out.println("Creating a developer without a name!");
//    }

    public Developer(String name) {
        super();
        this.name = name;
        System.out.println("Created a developer named " + name);
    }

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Created a developer name " + name + " who is " + age + "years old");
    }

    public void submitTimeCard() {
        System.out.println("I worked ANOTHER 49 hour week! Life is hard. But cha-ching.");
    }


    public void estimateStoryPoints() {
        System.out.println("I think that's a 4!");
    }

    public void checkInCode() {
        System.out.println("git commit! I did it! I hope!");
    }
}