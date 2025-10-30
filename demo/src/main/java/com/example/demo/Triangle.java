package com.example.demo;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        if (a < 0) {
            this.a = 0;
        } else
            this.a = a;
    }

    public void setB(double b) {
        if (b < 0) {
            this.b = 0;
        } else
            this.b = b;
    }

    public void setC(double c) {
        if (c < 0) {
            this.c = 0;
        } else
            this.c = c;
    }

    private boolean checkTriangle() {
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            return true;
        }
        return false;
    }

    public Triangle(double a, double b, double c) {
        if (checkTriangle()) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public double Perimeter() {
        return a + b + c;
    }

    @Override
    public double Area() {
        double p = Perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle (" + a + " " + b + " " + c + ")";
    }

}
