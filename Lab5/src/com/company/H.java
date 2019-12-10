package com.company;

public class H extends G {
    protected String h;
    protected X x = new X("X from H class"); // when x is private , classes I and J do not have access

    H(String newH) {
        super("Paula");
        h = newH;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x='" + x + '\'' +
                '}';
    }
}
