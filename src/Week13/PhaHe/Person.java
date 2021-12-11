package Week13.PhaHe;

import java.util.ArrayList;

public class Person {

  public static ArrayList<Person> gen = new ArrayList<>();
  public static int newGen;

  private String name;
  private String data;
  private String sex;
  private Person marriage;
  private ArrayList<Person> children = new ArrayList<>();

  public Person() {

  }

  public Person(String name) {
    this.name = name;
    this.data = "01/01/2022";
    this.sex = "unknown";
  }

  public Person(String name, String data, String sex) {
    this.name = name;
    this.data = data;
    this.sex = sex;
  }

  public void findMarriage() {
    ArrayList<String> temp = new ArrayList<>();
    if (this.marriage == null) {
      System.out.print(name + " ");
      return;
    }
    for (Person child : children) {
      child.findMarriage();
    }
  }

  public void findHaveTwoChildren() {
    if (children.size() == 2) {
      System.out.println("Vợ chồng(" + name +"," + marriage.getName() + ") ");
    }
    for (Person child : children) {
      child.findHaveTwoChildren();
    }
  }

  public void findNewGen(int stage) {
    if(children.size() == 0) {
      if(newGen == stage) {
        gen.add(new Person(name, data, sex));
      } else if (newGen < stage) {
        newGen++;
        gen.clear();
        gen.add(new Person(name, data, sex));
      }
      return;
    }
    for (Person child : children) {
      child.findNewGen(stage + 1);
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Person getMarriage() {
    return marriage;
  }

  public void setMarriage(Person marriage) {
    this.marriage = marriage;
  }

  public ArrayList<Person> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<Person> children) {
    this.children = children;
  }
}
