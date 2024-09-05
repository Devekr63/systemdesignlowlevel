package org.example;

import org.example.factory.point.Point;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Point cartesianPoint = Point.Factory.newCartesianPoint(2, 4);
        Point polarPoint = Point.Factory.newPolarPoint(100, 45);

        System.out.println(cartesianPoint);
        System.out.println(polarPoint);
    }
}