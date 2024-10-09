package org.example.utils;

public class GeometryHelper {
    public static double convertToMeters(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "cm":
                return value / 100;
            case "mm":
                return value / 1000;
            default:
                return value;
        }
    }

    public static boolean compareAreas(double area1, double area2) {
        return Double.compare(area1, area2) == 0;
    }
}
