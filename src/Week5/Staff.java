package Week5;

public class Staff extends Person {

  private String school;
  private double pay;

  /**
   * hi.
   * @param name    is name.
   * @param address is address.
   * @param school  is school.
   * @param pay     is pay.
   */
  public Staff(String name, String address, String school, double pay) {
    super(name, address);
    this.school = school;
    this.pay = pay;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public double getPay() {
    return pay;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }

  /**
   * dsa.
   * @return string.
   */
  public String toString() {
    return "Staff["
        + super.toString()
        + ",school=" + school
        + ",pay=" + pay
        + "]";
  }
}
