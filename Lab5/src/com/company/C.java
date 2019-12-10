package com.company;

public class C extends B{
    protected String c;

    C(String newC) {
        super("Madalina");
        c = newC;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
