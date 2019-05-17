package com.trilogy.inheritance;

public class TeamLead extends Developer {
    private boolean isInTheOffice;

    public TeamLead() {
        super("Nameless");
    }

    public TeamLead(boolean isInTheOffice, String name) {
        super(name);
//        this.name = "Danalammadingdong";
        this.isInTheOffice = isInTheOffice;
    }

    public void submitTimeCard() {
        System.out.println("I work harder than a plain old developer. 50 hours. Cha-cha-cha-ching.");
    }

    public void planIteration() {

        System.out.println("Here's what we can get done this week!");
    }

    //   public void estimateStoryPoints() {

    public void estimateStoryPoints() {
        System.out.println("Things are easier for team leads. This is only 2 points.");
    }


    public void assignWork(Developer dev) {
        System.out.println("Help Kevin out and do this work, " + dev);
    }

    private int bossAround() {
        System.out.println("DO WHAT I SAY TO DO!!!!");
        int peopleIBossedAround = 5;
        return peopleIBossedAround;
    }

    public void workHard() {
        System.out.println("The way I work hard is by bossing people around. It's hard work.");
        int bossAroundResult = this.bossAround();
        System.out.println("I bossed around " + bossAroundResult + " people.");
    }
}