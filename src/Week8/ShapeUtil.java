package Week8;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {

  /**
   * hi.
   * @param shapes is shapes.
   * @return list of shape.
   */
  public String printInfo(List<GeometricObject> shapes) {
    StringBuilder ans = new StringBuilder();
    List<GeometricObject> circles = new ArrayList<>();
    List<GeometricObject> triangles = new ArrayList<>();
    for (GeometricObject object : shapes) {
      if (object instanceof Circle) {
        circles.add(object);
      } else if (object instanceof Triangle) {
        triangles.add(object);
      }
    }
    ans.append("Circle:\n");
    for (GeometricObject object : circles) {
      ans.append(object.getInfo()).append("\n");
    }
    ans.append("Triangle:\n");
    for (GeometricObject object : triangles) {
      ans.append(object.getInfo()).append("\n");
    }
    return ans.toString();
  }
}
