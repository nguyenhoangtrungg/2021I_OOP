package Week10.LapTrinhTongQuat;

import java.util.Objects;

public class Person implements Comparable<Person> {

  private String name;
  private int age;
  private String address;

  public Person() {
  }

  /**
   * hi.
   *
   * @param name    is name.
   * @param age     is age.
   * @param address is add.
   */
  public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public int compareTo(Person o) {
    if (this.name.equals(o.name)) {
      return Integer.compare(this.age, o.age);
    }
    return this.name.compareTo(o.name);
  }
}
