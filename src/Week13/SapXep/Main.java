package Week13.SapXep;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    SortedList demo1 = new SortedList(new InsertionSort());
    demo1.setInput(new ArrayList<Integer>(Arrays.asList(5, 2, 6, 3, 8, 0)));
    demo1.sort();
    for(int i = 0; i < demo1.getInput().size(); i++) {
      System.out.print(demo1.getInput().get(i) + " ");
    }

    System.out.println();

    SortedList demo2 = new SortedList(new SelectionSort());
    demo2.setInput(new ArrayList<Integer>(Arrays.asList(5, 2, 6, 3, 8, 0)));
    demo2.sort();
    for(int i = 0; i < demo2.getInput().size(); i++) {
      System.out.print(demo2.getInput().get(i) + " ");
    }
  }
}
