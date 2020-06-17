package ru.stqa.pft.sandbox;

public class Point {

  double x1 = 0, y1 = 0, x2 = 4, y2 = 10;

  public static void main(String[] args) {
    Point p1 = new Point();
    Point p2 = new Point();


    System.out.println("Расстояние между точками (" + p1.point1() + ") и (" + p2.point2() + ") = " + distance(p1, p2));

  }

  public static double distance(Point p1, Point p2) {

    return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1) * (p2.y2 - p1.y1));

  }

  public String point1() {

    return this.x1 + ";" + this.y1;
  }

  public String point2() {

    return this.x2 + ";" + this.y2;
  }


}