package Week2;

import static java.lang.Integer.max;

public class Week4 {

  /**
   *
   * @param a
   * @param b
   */
  public static int max2Int(int a, int b) {
    return Math.max(a, b);
  }

  /**
   * minArray find min value in array
   *
   * @param arr
   * @return min of array $arr
   */
  public static int minArray(int[] arr) {
    int Ans = (int) 1e9;
    for (int j : arr) {
      Ans = Math.min(Ans, j);
    }
    return Ans;
  }

  /**
   * calculateBMI calculate BMI
   *
   * @param weight: in kg
   * @param height: in m
   * @return BMI index
   */
  public static String calculateBMI(double weight, double height) {
    double bmi = Math.round(weight / (height * height) * 10.0) / 10.0;
    if (bmi < 18.5) {
      return "Thiếu cân";
    } else if (bmi < 23) {
      return "Bình thường";
    } else if (bmi < 25) {
      return "Thừa cân";
    } else {
      return "Béo phì";
    }
  }
}