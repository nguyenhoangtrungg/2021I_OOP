package Week13.PhaHe;

public class Main {
  public static void main(String[] args) {
    Person a = new Person("a");
    Person b = new Person("b");
    Person c = new Person("c");
    Person d = new Person("d");

    a.setMarriage(b);

    a.getChildren().add(c);
    a.getChildren().add(d);

    System.out.print("Người chưa kết hôn: ");
    a.findMarriage();
    System.out.println();
    System.out.println();

    System.out.print("Người có 2 con: ");
    a.findHaveTwoChildren();
    System.out.println();

    System.out.print("Thế hệ mới nhất trong danh sách phả hệ: ");
    a.findNewGen(0);
    for(int i = 0; i < Person.gen.size(); i++) {
      System.out.print(Person.gen.get(i).getName() + " ");
    }
  }
}