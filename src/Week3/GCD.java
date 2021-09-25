package Week3;

public class GCD {

  /**
   * ello.
   * @param u is u.
   * @param v is v.
   * @return gcd.
   */
  public static int gcd(int u, int v) {
    if (v == 0) {
      return Math.abs(u);
    }
    return gcd(v, u % v);
  }
  public static void main(String[] args) {

  }
}
