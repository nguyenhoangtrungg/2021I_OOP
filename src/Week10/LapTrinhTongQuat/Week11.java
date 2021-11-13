package Week10.LapTrinhTongQuat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week11 {

  /**
   * hi.
   *
   * @param arr is add.
   * @param <T> is xd.
   * @return hi.
   */
  public static <T> List<T> sortGeneric(List<T> arr) {
    arr.sort((x, y) -> {
      if (x instanceof Integer) {
        return ((Integer) x).compareTo((Integer) y);
      } else if (x instanceof String) {
        return ((String) x).compareTo((String) y);
      } else if (x instanceof Person) {
        return ((Person) x).compareTo((Person) y);
      } else {
        return 0;
      }
    });
    return arr;
  }

  public static void main(String[] args) {
    List<Person> demo = new ArrayList<>();
    demo.add(new Person("Nguyen A", 22, "A"));
    demo.add(new Person("Nguyen A", 20, "B"));
    demo.add(new Person("Le B", 20, "C"));
    demo = sortGeneric(demo);
    for (Person person : demo) {
      System.out.println(person.getName() + " " + person.getAge());
    }
  }
}
