package com.example.demo;

import java.util.ArrayList;

public class ShapeManager {
    ArrayList<Shape> list = new ArrayList();

    public ShapeManager() {
    }

    public void addShape(Shape shape) {
        list.add(shape);
    }

    public double maxArea() {
        double max = list.get(0).Area();
        for (Shape sh : list) {
            if (max < sh.Area()) {
                max = sh.Area();
            }
        }
        return max;
    }

    public Shape getMaxAreaShape() {
        double max = maxArea();
        Shape shape = list.get(0);
        for (Shape sh : list) {
            if (sh.Area() == max) {
                return sh;
            }
        }
        return shape;
    }

    public void displayAll() {
        for (Shape sh : list) {
            System.out.println(sh.toString());
        }
    }

    public double totalArea() {
        double total = 0;
        for (Shape sh : list) {
            total += sh.Area();
        }
        return total;
    }

    public double totalPerimeter() {
        double total = 0;
        for (Shape sh : list) {
            total += sh.Perimeter();
        }
        return total;
    }

}
