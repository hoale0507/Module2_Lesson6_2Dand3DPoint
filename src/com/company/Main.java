package com.company;

public class Main {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.setXy(10,10);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D.setXyz(10,10,10);
        System.out.println(point3D);
    }
}
