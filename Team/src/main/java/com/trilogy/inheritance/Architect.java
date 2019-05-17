package com.trilogy.inheritance;

public class Architect extends TeamLead {

    public Architect() {
        super();
        //I can access protected members of my base classes
        //name is a protected member of Developer
        //Below will change the developer to the developer's name
        //with " the Great." afterward
        name = name + " the Great.";
    }

    public Architect(String name) {
        super(true, "Bria");
    }

    public void createTechRoadmap() {
        System.out.println("We will use kafka!");
    }

    public void evaluateVendor(String vendor) {
        System.out.println("I can tell if you're incompetent, " + vendor);
    }

    public void createANewArchitecture() {
        System.out.println("I can create a new architecture, but I can't boss people around.");
        //this.bossAround();
    }
}