package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("Pavel");
    hello("user");

    double i = 5;
    double a = 3;
    double b = 6;

      System.out.println("Площадь квадрата со стороной " + i + " = " + area(i));
      System.out.println("Площадь прямоугольника со стронами " + a + " и " + b + " = " + area(a, b));
  }


  public static void  hello(String somebody){
      System.out.println("Hello, " + somebody + "!");
  }


  public static double area(double len){
      return len * len;
  }
  public  static  double area(double a, double b){
      return a * b;
  }
}
