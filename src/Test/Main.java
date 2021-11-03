package Test;

public class Main {
  public static void main(String[] args) {
    Shape a = new Circle(1);
    Shape b = new Rectangle(1,1);
    Shape c = new Triangle(1,1,1);
    Shape d = new Square(1);
    a.draw();
    b.draw();
    c.draw();
    d.draw();
  }
}
