package com.example.demo;

public class Circle extends Shape {
    private double radius;
    private String color;
    private boolean check;

    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else
            this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Check(boolean check) {
        this.check = check;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isCheck() {
        return check;
    }

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else
            this.radius = radius;
    }

    public Circle(double radius, String color, boolean check) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
        this.color = color;
        this.check = check;
    }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Circle (Radius: " + radius + ")";
    }

}
