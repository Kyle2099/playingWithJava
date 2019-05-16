package com.trilogy;

public class Chair implements Rollable {
    private String color;
    private int height;
    private boolean reclined;
    private Location locationOfTheChair;

    public Location getLocationOfTheChair() {
        return locationOfTheChair;
    }

    public void setLocationOfTheChair(Location locationOfTheChair) {
        this.locationOfTheChair = locationOfTheChair;
    }


//    public Chair() {
//        super();
//    }

    public Chair (String inputColor, int height, boolean reclined, Location locationOfTheChair) {
        color = inputColor;
        this.height = height;
        this.reclined = reclined;
        this.locationOfTheChair = locationOfTheChair;
    }

    public String getColor() {
        return color;
    }

    public boolean isReclined() {
        return reclined;
    }

    public void setReclined(boolean reclined) {
        this.reclined = reclined;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    private String color;
//    private int height;
//    private boolean reclined;

    public void recline() {
        if (reclined == true) {
            System.out.println("The chair was already reclined before you called recline");
        } else {
            System.out.println("I am reclining now");
            reclined = true;
            height = height - 10;
        }
    }

    public void unRecline() {
        if (reclined == true) {
            System.out.println("Putting this chair back to the initial position");
            reclined = false;
            height = height + 10; //or height += 10
        } else {
            System.out.println("Oh, hey, look! You're already upright.");
        }


    }
    @Override
    public void stopRolling() {
        System.out.println("We're not rolling any more.");
    }

    @Override
    public void startRolling() {
        System.out.println("WOOHOOO!!!!! Careful, now. We're rolling");
    }

    @Override
    public int getMaxRollingSpeed() {
        return 100;
    }

}