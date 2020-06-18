package ru.stqa.pft.sandbox;

import static ru.stqa.pft.sandbox.Point.distance;

public class MySecondProgram {



  public static void main(String[] args) {
    Point p1 = new Point(0.0, 0.0);
    Point p2 = new Point(1.0, 0.0);


    System.out.println("Расстояние между точками (" + p1.point1() + ") и (" + p2.point2() + ") = " + distance(p1, p2));

  }


}





