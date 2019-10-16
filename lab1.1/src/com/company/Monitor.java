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
        System.out.println("com.company.Monitor " + this.name + " Color: " + this.color);
    }
    void setDimensions(float newWidth, float newHeigth) {
        this.width = newWidth;
        this.height = newHeigth;
    }
    void showDimensions() {
        System.out.println("com.company.Monitor " + this.name + " Height: " + this.height + " Width: " + this.width);
    }
    void setResolution(String resolution) {
        this.resolution = resolution;
    }
    void showResolution() {
        System.out.println("com.company.Monitor " + this.name + " has resolution : " + this.resolution);
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
