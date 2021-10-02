package Week2;

import java.io.*;

public class Main {

  private final static String FILE_URL = "E:\\GitHub\\2021I_OOP\\src\\Week2\\ae.txt";

  public static void main(String[] args) throws IOException {
    String[] data = {
        "Hello Java!",
        "Good bye!"
    };
    File file = new File(FILE_URL);
    OutputStream outputStream = new FileOutputStream(file);
    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

    for (String item : data) {
      outputStreamWriter.write(item);
      // Dùng để xuống hàng
      outputStreamWriter.write("\n");
    }
    // Đây là phương thức quan trọng!
    // Nó sẽ bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
    outputStreamWriter.flush();
  }
}
