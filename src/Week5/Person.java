package Week5;

public class Person {

  private String name;
  private String address;

  /**
   * hi.
   * @param name    is name.
   * @param address is address.
   */

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  /**
   *  hi.
   * @return string.
   */
  public String toString() {
    return "Person["
        + "name=" + name
        + ",address=" + address
        + ']';
  }
}
