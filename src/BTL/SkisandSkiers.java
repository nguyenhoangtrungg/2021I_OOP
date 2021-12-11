package BTL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SkisandSkiers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> brr = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      arr.add(x);
    }
    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      brr.add(x);
    }

    double ans = 0;

    Collections.sort(arr);
    Collections.sort(brr);

    for (int i = 0; i < N; i++) {
      ans += Math.abs(arr.get(i) - brr.get(i));
    }

    ans /= N;

    System.out.printf("%.9f", ans);
  }
}

