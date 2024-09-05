package org.example.factory.point;

public class Point {
    private double x,y;

//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }

    //Following constructor is not allowed
//    public Point(double rho, double theta){
//        x = rho*Math.cos(theta);
//        y = rho*Math.sin(theta);
//    }

    private Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static class Factory{
        public static Point newCartesianPoint(double x, double y){
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta){
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" +  x +
                ", y=" + y +
                '}';
    }
}
