package Week3;

public class Solution2 {

  /**
   * ello.
   * @param u is u.
   * @param v is v.
   * @return gcd.
   */
  public static int GCD(int u, int v) {
    if (v == 0) {
      return Math.abs(u);
    }
    return GCD(v, u % v);
  }
}
