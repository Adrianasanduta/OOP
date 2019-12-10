package com.company;

public class D extends C{
    protected String d;
    protected X x = new X("X from D class");

    D(String newD) {
        super("Ilona");
        d = newD;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x='" + x + '\'' +
                '}';
    }
}
