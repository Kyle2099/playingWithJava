package com.trilogy.inheritance;

import com.trilogy.inheritance.Architect;
import com.trilogy.inheritance.Developer;
import com.trilogy.inheritance.StaffMember;
import com.trilogy.inheritance.TeamLead;

public class SoftwareCompany {
    public static void main(String[] args) {
        Developer dan = new Developer("Dan");
        TeamLead jen = new TeamLead();
        Architect arturo = new Architect();

        System.out.println("Dan the developer can do all of this!");
        dan.checkInCode();
        dan.estimateStoryPoints();

        System.out.println("_____________________________________________________");

        System.out.println();
        System.out.println("Jen the team lead can do all of this!");
        jen.checkInCode();
        jen.estimateStoryPoints();
        jen.planIteration();
        jen.assignWork(dan);
        jen.workHard();
        jen.submitTimeCard();


        System.out.println("_____________________________________________________");

        System.out.println();
        System.out.println("Arturo the architect can do all of this!");
        arturo.checkInCode();
        arturo.estimateStoryPoints();
        arturo.planIteration();
        arturo.assignWork(jen);
        arturo.createTechRoadmap();
        arturo.evaluateVendor("Google");
        arturo.submitTimeCard();


        System.out.println("_____________________________________________________");

        System.out.println();
        System.out.println("I'd like to create a staff member");
        Developer aaron = new Developer("Aaron", 48);
        aaron.submitTimeCard();


    }
}