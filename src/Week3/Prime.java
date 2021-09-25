package Week3;

import java.util.Scanner;

public class Prime {

  /**
   * helo.
   *
   * @param u int u.
   * @return u.
   */
  public static boolean isPrime(int u) {
    if (u == 0) {
      return false;
    }
    if (u == 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(u); i++) {
      if (u % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean ans = isPrime(n);
    System.out.println(ans);
  }
}
