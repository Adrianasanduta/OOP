package com.company;

public class Box {
    private float height;
    private float width;
    private float depth;

    // function constructor
    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;

    }
    public Box(float initValue) {
        this.height = initValue;
        this.width = initValue;
        this.depth = initValue;
    }

    public Box(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
     public double getSurface() {
        float surface = 2* this.depth + 2* this.width + 2*this.height;
        return surface;
     }
    public double getVolume() {
        float volume = this.depth * this.height + this.width;
        return volume;

    }
}
