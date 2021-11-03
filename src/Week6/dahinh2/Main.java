package Week6.dahinh2;

public class Main {
  public static void main(String[] args) {
    Point x = new Point(1.1,2.1);
    Shape s1 = new Circle( x ,5.5, "RED", false);
    System.out.println(s1);
    System.out.println(s1.getArea());
    System.out.println(s1.getPerimeter());
    System.out.println(s1.getColor());
    System.out.println(s1.isFilled());

    Circle c1 = (Circle)s1;
    System.out.println(c1);
    System.out.println(c1.getArea());
    System.out.println(c1.getPerimeter());
    System.out.println(c1.getColor());
    System.out.println(c1.isFilled());
    System.out.println(c1.getRadius());


    Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
    System.out.println(s3);
    System.out.println(s3.getArea());
    System.out.println(s3.getPerimeter());
    System.out.println(s3.getColor());

    Rectangle r1 = (Rectangle)s3;
    System.out.println(r1);
    System.out.println(r1.getArea());
    System.out.println(r1.getColor());
    System.out.println(r1.getLength());

    Shape s4 = new Square(6.6);
    System.out.println(s4);
    System.out.println(s4.getArea());
    System.out.println(s4.getColor());



  }
}
