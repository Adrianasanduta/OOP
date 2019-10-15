package com.company;

class Monitor {
    private String name;
    private String color;
    private float width;
    private float height;
    private String resolution;
// function constructor
    public Monitor(String name, String color, float width, float height, String resolution) {
       this.color = color;
       this.name = name;
       this.width = width;
       this.height = height;
       this.resolution = resolution;
    
    }

    public Monitor(String name) {
        // This constructor has one parameter, name.
        this.name = name;
    }
    void setColor(String newColor) {
        this.color = newColor;
    }
    void showColor() {
        System.out.println("Monitor " + this.name + " Color: " + this.color);
    }
    void setDimensions(float newWidth, float newHeigth) {
        this.width = newWidth;
        this.height = newHeigth;
    }
    void showDimensions() {
        System.out.println("Monitor " + this.name + " Height: " + this.height + " Width: " + this.width);
    }
    void setResolution(String resolution) {
        this.resolution = resolution;
    }
    void showResolution() {
        System.out.println("Monitor " + this.name + " has resolution : " + this.resolution);
    }

    String getName(){
        return this.name;
    }
    String getColor(){
        return this.color;
    }

    float getHeight() {
        return this.height;
    }
    float getWidth() {
        return this.width;
    }

    void showInfo() {
        this.showResolution();
        this.showDimensions();
        this.showColor();
    }
}

public class Main {

    public static void main(String[] args) {
        Monitor lg = new Monitor("LG");
        Monitor samsung = new Monitor("Samsung", "Red", 12, 10, "1080p");
        lg.setColor("White");
        lg.showColor();
        lg.setDimensions(9,10);
        lg.showDimensions();
        lg.setResolution("720p");
        lg.showResolution();
        samsung.setColor("Green");
        samsung.showInfo();
        System.out.println("=====================");
        System.out.println("Monitor "+lg.getName()+" has color " + lg.getColor() + "  \nBut "+samsung.getName()+" has color "+ samsung.getColor());

        if (lg.getHeight()> samsung.getHeight()) {
            System.out.println("Monitor " + lg.getName() + " is higher than  Monitor " + samsung.getName());
        } else {
            System.out.println("Monitor " + samsung.getName() + " is higher than  Monitor " + lg.getName());
        }

        if (lg.getWidth()> samsung.getWidth()) {
            System.out.println("Monitor " + lg.getName() + " is widder than  Monitor " + samsung.getName());
        } else {
            System.out.println("Monitor " + samsung.getName() + " is widder than  Monitor " + lg.getName());
        }





    }
}
