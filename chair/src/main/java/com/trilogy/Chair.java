package com.trilogy;

public class Chair {

    private String color;
    private int height;
    private boolean reclined;


    public Chair (String color, int height, boolean reclined) {
        this.color = color;
        this.height = height;
        this.reclined = reclined;
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


    public int height() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }


    public boolean recline() {

        if (reclined == true) {
            System.out.println("The chair was already reclined before you called recline.");
        } else {
            System.out.println("I am reclining now ");
            reclined = true;
            height = height - 10;


        }


    }

    public void unRecline() {
        if (reclined == true) {
            System.out.println("Putting this chair back to the initial position");
            reclined = false;
            height = height + 10;
        }
    }






}
