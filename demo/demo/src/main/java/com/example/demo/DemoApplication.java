package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ShapeManager manager = new ShapeManager();
		manager.addShape(new Circle(5.0, "blue", true));
		manager.addShape(new Rectangle(10.0, 8.0, "green", false));
		manager.addShape(new Square(3.0, "yellow", true));
		manager.addShape(new Circle(2.5));
		manager.displayAll();
		System.out.printf("\nTotal area: %.2f\n", manager.totalArea());
		System.out.printf("Total perimeter %.2f\n", manager.totalPerimeter());
		Shape max = manager.getMaxAreaShape();
		System.out.println("\nShape with the largest area:");
		System.out.println(max);
	}
}
