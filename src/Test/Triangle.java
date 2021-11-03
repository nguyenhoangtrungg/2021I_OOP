package Test;

public class Triangle extends Shape {

  protected int x;
  protected int y;
  protected int z;

  public Triangle() {

  }

  public Triangle(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  private boolean isTriangle() {
    return (x + y >= z && y + z >= x && x + z >= y);
  }

  @Override
  public double getPerimeter() {
    if(!isTriangle()) return 0.0;
    return x + y + z;
  }

  @Override
  public void draw() {
    if(!isTriangle()) System.out.println("Incorrect");
    System.out.println("This is a Triangle");
  }
}
