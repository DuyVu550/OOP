package com.example.demo;

public class Square extends Shape {

    private double side;
    private boolean check;
    private String color;

    public void setSide(double side) {
        if (side < 0) {
            side = 0;
        } else
            this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getLength(double length) {
        return length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public void Check(boolean check) {
        this.check = check;
    }

    public boolean getCheck(boolean check) {
        return check;
    }

    public Square(double side, String color, boolean check) {
        if (side <= 0) {
            this.side = 1;
        } else {
            this.side = side;
            this.color = color;
            this.check = check;
        }
    }

    @Override
    public double Perimeter() {
        return side * 4;
    }

    @Override
    public double Area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square (Side: " + side + " Color: " + color + " Check: " + check + ")";
    }
}
