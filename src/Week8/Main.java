package Week8;

public class Main {

  public static void main(String[] args) {
    Circle a = new Circle(new Point(1,1), 4);
    System.out.println(a.getInfo());
    Triangle b = new Triangle(new Point(0.00,-3.00), new Point(5.00,0.00),
        new Point(0.00,0.00));
    System.out.println(b.getInfo());
  }

}
