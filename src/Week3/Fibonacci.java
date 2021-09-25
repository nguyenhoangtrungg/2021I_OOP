package Week3;

import java.util.Scanner;

public class Fibonacci {
  /**
   * hello.
   * hel.
   * @param n long n.
   * @return n.
   */
  public static long fibonacci(long n) {
    long ans = -1;
    if (n < 0) {
      return ans;
    }
    long[] fib = new long[101];
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i <= n; ++i) {
      if (Long.MAX_VALUE - fib[i - 1] > fib[i - 2]) {
        fib[i] = fib[i - 1] + fib[i - 2];
      } else {
        return Long.MAX_VALUE;
      }
    }
    ans = fib[(int) n];
    return ans;
  }

  public static void main(String[] args) {

  }
}
