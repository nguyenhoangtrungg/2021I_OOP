package Week9.NgoaiLe2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

  public void nullPointerEx() throws NullPointerException {
    throw new NullPointerException();
  }

  public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
    throw new NullPointerException();
  }

  public void arithmeticEx() throws ArithmeticException {
    throw new NullPointerException();
  }

  public void fileNotFoundEx() throws FileNotFoundException {
    throw new FileNotFoundException("Lỗi File Not Found");
  }

  public void ioEx() throws IOException {
    throw new IOException("Lỗi IO");
  }

  /**
   * hi.
   * @return error.
   */
  public String nullPointerExTest() {
    try {
      nullPointerEx();
      return "Không có lỗi";
    } catch (NullPointerException e) {
      return "Lỗi Null Pointer";
    }
  }

  /**
   * hi.
   * @return error.
   */
  public String arrayIndexOutOfBoundsExTest() {
    try {
      arrayIndexOutOfBoundsEx();
      return "Không có lỗi";
    } catch (NullPointerException e) {
      return "Lỗi Array Index Out of Bounds";
    }
  }

  /**
   * hi.
   * @return error.
   */
  public String arithmeticExTest() {
    try {
      arithmeticEx();
      return "Không có lỗi";
    } catch (NullPointerException e) {
      return "Lỗi Arithmetic";
    }
  }

  /**
   * hi.
   * @return error.
   */
  public String fileNotFoundExTest() {
    try {
      fileNotFoundEx();
      return "Không có lỗi";
    } catch (FileNotFoundException n) {
      return "Lỗi File Not Found";
    }

  }

  /**
   * hi.
   * @return error.
   */
  public String ioExTest() {
    try {
      ioEx();
      return "Không có lỗi";
    } catch (IOException e) {
      return "Lỗi IO";
    }
  }
}