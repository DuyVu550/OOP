package com.example.demo;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected String color;
    protected boolean check;

    public void setWidth(double width) {
        if (width > length) {
            double temp = length;
            length = width;
            width = temp;
        }
        if (width < 0) {
            this.width = 0;
        } else
            this.width = width;
    }

    public double getWidth(double width) {
        return width;
    }

    public void setLength(double length) {
        if (length < width) {
            double temp = length;
            length = width;
            width = temp;
        }
        if (length < 0) {
            this.length = 0;
        } else
            this.length = length;
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

    public Rectangle(double width, double length, String color, boolean check) {
        if (width > length || length < width) {
            double temp = length;
            length = width;
            width = temp;
        }
        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
        this.length = length;
        this.width = width;
        this.color = color;
        this.check = check;
    }

    @Override
    public double Perimeter() {
        return (width + length) * 2;
    }

    @Override
    public double Area() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Reactangle (Width: " + width + " Length: " + length + " Color: " + color + " Check: " + check + ")";
    }

}
