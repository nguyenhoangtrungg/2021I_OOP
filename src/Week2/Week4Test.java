package Week2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Week4Test {

  @Test
  public void testMax2Int1() {
    assertEquals(5, Week4.max2Int(3, 5));
  }

  @Test
  public void testMax2Int2() {
    assertEquals(3, Week4.max2Int(3, 1));
  }

  @Test
  public void testMax2Int3() {
    assertEquals(0, Week4.max2Int(0, -1));
  }

  @Test
  public void testMax2Int4() {
    assertEquals(-4, Week4.max2Int(-7, -4));
  }

  @Test
  public void testMax2Int5() {
    assertEquals(9999, Week4.max2Int(9999, -9339));
  }

  @Test
  public void testMinArray1() {
    int arr[] = {1, 2, 3, 4, 5};
    assertEquals(1, Week4.minArray(arr));
  }

  @Test
  public void testMinArray2() {
    int arr[] = {1, 2, 3, 4, 5};
    assertEquals(1, Week4.minArray(arr));
  }

  @Test
  public void testMinArray3() {
    int arr[] = {-99, 0, -10101, 2, 3, 4, 7};
    assertEquals(-10101, Week4.minArray(arr));
  }

  @Test
  public void testMinArray4() {
    int arr[] = {3, 3, 3, 3, 3};
    assertEquals(3, Week4.minArray(arr));
  }

  @Test
  public void testMinArray5() {
    int arr[] = {-10000, 10000, 0};
    assertEquals(-10000, Week4.minArray(arr));
  }

  @Test
  public void testCalculateBMI1() {
    assertEquals("Bình thường", Week4.calculateBMI(55, 1.725));
  }

  @Test
  public void testCalculateBMI2() {
    assertEquals("Bình thường", Week4.calculateBMI(60, 1.66));
  }

  @Test
  public void testCalculateBMI3() {
    assertEquals("Thừa cân", Week4.calculateBMI(75, 1.75));
  }

  @Test
  public void testCalculateBMI4() {
    assertEquals("Béo phì", Week4.calculateBMI(80, 1.66));
  }

  @Test
  public void testCalculateBMI5() {
    assertEquals("Bình thường", Week4.calculateBMI(70, 1.8));
  }
}