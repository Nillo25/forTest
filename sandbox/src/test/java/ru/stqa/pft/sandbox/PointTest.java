package ru.stqa.pft.sandbox;

import static ru.stqa.pft.sandbox.Point.distance;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test

  public void testPoint() {

    Point p1 = new Point(0, 0);
    Point p2 = new Point(1, 0);
    Assert.assertEquals(distance(p1, p2), 1);
  }


}
