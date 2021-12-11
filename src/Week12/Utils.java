package Week12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Utils {

  public static String readContentFromFile(String path) throws FileNotFoundException {
    FileInputStream fileInputStream = new FileInputStream(path);
    Scanner sc = new Scanner(fileInputStream);
    StringBuilder output = new StringBuilder();
    while(sc.hasNextLine()) {
      output.append(sc.nextLine()).append("\n");
    }
    return output.toString();
  }

  public static void writeContentToFile(String path, String content) throws IOException {
    File file = new File(path);
    FileOutputStream outputStream = new FileOutputStream(file);
    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
    outputStreamWriter.write(content);
    outputStreamWriter.flush();
  }

  public static void appendContentToFile(String path, String content) throws IOException {

    String input = readContentFromFile(path) + content;

    File file = new File(path);
    FileOutputStream outputStream = new FileOutputStream(file);
    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
    outputStreamWriter.write(input);
    outputStreamWriter.flush();
  }


  public static File findFileByName(String folderPath, String fileName) {
    File folder = new File(folderPath);
    File[] files = folder.listFiles();
    if (files != null) {
      for (File file : files) {
        if (file.getName().equals(fileName)) {
          return file;
        }
      }
    }
    return null;
  }

  public static void main(String[] args) throws IOException {

    System.out.println(readContentFromFile("E:\\GitHub\\2021I_OOP\\src\\Week12\\Test\\Test1.txt"));
    System.out.println(readContentFromFile("src\\Week12\\Test\\Test1.txt"));

    writeContentToFile("E:\\GitHub\\2021I_OOP\\src\\Week12\\Test\\Test2.txt", "Hom nay la thu 7");
    System.out.println(readContentFromFile("E:\\GitHub\\2021I_OOP\\src\\Week12\\Test\\Test2.txt"));

    appendContentToFile("E:\\GitHub\\2021I_OOP\\src\\Week12\\Test\\Test3.txt", "Con Ca tren hon Da");
    System.out.println(readContentFromFile("E:\\GitHub\\2021I_OOP\\src\\Week12\\Test\\Test3.txt"));

    System.out.println(findFileByName("E:\\GitHub\\2021I_OOP\\src\\Week12\\Test", "Test1.txt"));
  }
}
