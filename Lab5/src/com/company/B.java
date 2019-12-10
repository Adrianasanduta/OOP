package com.company;

public class B extends A{
    protected String b;

    B(String newB) {
        super("Sandrinia", new X("Tatiana")); //cheama constructorul lui A
        b = newB;
    }

    @Override
    public String toString() {
        return "B{" +
                "a='" + a + '\'' +
                "b='" + b + '\'' +
                "x='" + x + '\'' +
                '}';
    }
}
