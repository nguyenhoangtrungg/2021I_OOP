package Week3;

public class Solution {

  private int numerator;

  private int denominator = 1;

  public int getNumerator() {
    return numerator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  /**
   * d.
   * @param denominator a.
   */
  public void setDenominator(int denominator) {
    if (denominator != 0) {
      this.denominator = denominator;
    }
  }

  Solution(int numerator, int denominator) {
    this.numerator = numerator;
    if (denominator != 0) {
      this.denominator = denominator;
    }
  }

  /**
   * hello.
   * @param u is u.
   * @param v is v.
   * @return return gcd.
   */
  public static int gcd(int u, int v) {
    if (v == 0) {
      return Math.abs(u);
    }
    return gcd(v, u % v);
  }

  /**
   * hello.
   * @return re.
   */
  public Solution reduce() {
    int i = gcd(this.getNumerator(), this.getDenominator());
    if (this.numerator * this.denominator < 0) {
      setNumerator(-Math.abs(this.numerator / i));
      setDenominator(Math.abs(this.denominator / i));
    } else {
      setNumerator(Math.abs(this.numerator / i));
      setDenominator(Math.abs(this.denominator / i));
    }
    return this;
  }

  /**
   * hel.
   * @param u is u.
   * @return u.
   */
  public Solution add(Solution u) {
    int num = this.numerator * u.denominator + this.denominator * u.numerator;
    int den = this.denominator * denominator;
    Solution ans = new Solution(num, den);
    return ans.reduce();
  }

  /**
   * h.
   * @param u is u.
   * @return u.
   */
  public Solution subtract(Solution u) {
    int num = this.numerator * u.denominator - this.denominator * u.numerator;
    int den = this.denominator * u.denominator;
    Solution ans = new Solution(num, den);
    return ans.reduce();
  }

  /**
   * i.
   * @param u is u.
   * @return u.
   */
  public Solution multiply(Solution u) {
    int num = this.numerator * u.numerator;
    int den = this.denominator * u.denominator;
    Solution ans = new Solution(num, den);
    return ans.reduce();
  }

  /**
   * h.
   * @param u is u.
   * @return u.
   */
  public Solution divide(Solution u) {
    int num = this.numerator * u.denominator;
    int den = this.denominator * u.numerator;
    Solution ans = new Solution(num, den);
    return ans.reduce();
  }

  /**
   * dh.
   * @param obj is obj.
   * @return ok.
   */
  public boolean equals(Object obj) {
    if (obj instanceof Solution) {
      Solution other = (Solution) obj;
      other.reduce();
      return this.numerator == other.numerator && this.denominator == other.denominator;
    }
    return false;
  }

  public void print() {
    System.out.println(this.numerator + "/" + this.denominator);
  }

  public static void main(String[] args) {

  }
}
