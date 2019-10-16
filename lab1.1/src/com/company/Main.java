package com.company;

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
