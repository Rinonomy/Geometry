package com.example.app;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;
import org.example.utils.GeometryHelper;
import org.example.Cube;
import org.example.Sphere;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());

        double areaCircle = 78.54;
        double areaRectangle = 78.54;

        boolean areEqual = GeometryHelper.compareAreas(areaCircle, areaRectangle);
        System.out.println("Равны ли площади? " + areEqual);

        double meters = GeometryHelper.convertToMeters(100, "cm");
        System.out.println("100 см в метрах: " + meters);

        Cube cube = new Cube(3);
        System.out.println("Объем куба: " + cube.getVolume());
        System.out.println("Площадь поверхности куба: " + cube.getSurfaceArea());

        Sphere sphere = new Sphere(2);
        System.out.println("Объем сферы: " + sphere.getVolume());
        System.out.println("Площадь поверхности сферы: " + sphere.getSurfaceArea());


    }


}
