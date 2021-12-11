package Week13.SapXep;

import java.util.ArrayList;

public class SortedList {

  private Sort sort;
  private ArrayList<Integer> input;

  public SortedList(Sort sort) {
    this.sort = sort;
  }

  public void sort() {
    sort.sort(input);
  }

  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public ArrayList<Integer> getInput() {
    return input;
  }

  public void setInput(ArrayList<Integer> input) {
    this.input = input;
  }
}
