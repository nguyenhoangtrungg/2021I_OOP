

public abstract class Vehicle {

  protected String brand;
  protected String model;
  protected String registrationNumber;
  protected Person owner;

  /**
   * hi.
   * @param brand is b.
   * @param model is m.
   * @param registrationNumber is r.
   * @param owner is o.
   */
  public Vehicle(String brand, String model, String registrationNumber, Person owner) {
    this.brand = brand;
    this.model = model;
    this.registrationNumber = registrationNumber;
    this.owner = owner;
  }

  public abstract String getInfo();

  public void transferOwnership(Person newOwner) {
    this.owner = newOwner;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registration) {
    this.registrationNumber = registrationNumber;
  }

  public Person getOwner() {
    return owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }
}
