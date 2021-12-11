package Week11.PhanTichLapTrinh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week11 {

  private static final String[] data = {"int", "double", "boolean", "char",
      "float", "long", "short", "bytes", "T[]", "int[]", "double[]", "boolean[]",
      "char[]", "float[]", "long[]", "short[]", "bytes[]"};


  private static final ArrayList<String> getImport = new ArrayList<>();
  private static final ArrayList<String> getPackage = new ArrayList<>();
  private static final ArrayList<String> getClass = new ArrayList<>();
  private static final ArrayList<String> getStatic = new ArrayList<>();

  /**
   * hi.
   * @param fileContent is f.
   * @return f.
   */
  public static List<String> getAllFunctions(String fileContent) {
    List<String> ans = new ArrayList<>();
    getImpAndClass(fileContent);
    getStatic(fileContent);
    for (String s : getStatic) {
      String result = handle(s);
      System.out.println(result);
      ans.add(result);
    }
    return ans;
  }

  /**
   * hi.
   * @param input is i.
   * @return i.
   */
  private static ArrayList<String> divString(String input) {
    ArrayList<String> result = new ArrayList<>();
    Scanner sc = new Scanner(input);
    while (sc.hasNext()) {
      result.add(sc.next());
    }
    return result;
  }

  /**
   * hi.
   * @param fileContent is f.
   */
  private static void getImpAndClass(String fileContent) {
    Scanner sc = new Scanner(fileContent);
    while (sc.hasNextLine()) {
      String here = sc.nextLine();
      if (here.split(" ")[0].equals("import")) {
        getImport.add(here.substring(7, here.length() - 1));
        getImport.add(here.substring(7, here.length() - 1) + "[]");
      } else if (here.split(" ")[0].equals("package")) {
        getPackage.add(here.substring(8, here.length() - 1));
        getPackage.add(here.substring(8, here.length() - 1) + "[]");
      }
      ArrayList<String> divString = divString(here);
      for (int i = 0; i < divString.size(); i++) {
        if (divString.get(i).equals("class")) {
          getClass.add(getPackage.get(0) + "." + divString.get(i + 1));
          getClass.add(getPackage.get(0) + "." + divString.get(i + 1) + "[]");
        }
      }
    }
  }

  /**
   * hi.
   * @param fileContent is f.
   */
  private static void getStatic(String fileContent) {
    Scanner sc = new Scanner(fileContent);
    while (sc.hasNextLine()) {
      String here = sc.nextLine();
      ArrayList<String> divString = divString(here);
      boolean ok = false;
      String returnStatic = "";
      for (int i = 0; i < divString.size(); i++) {
        String getStr = divString.get(i);
        if (getStr.equals("{") || getStr.equals("{}")) {
          break;
        }
        if (ok) {
          returnStatic += getStr + " ";
        }
        if (getStr.equals("static")) {
          ok = true;
          i++;
        }
      }
      if (!returnStatic.isEmpty()) {
        getStatic.add(returnStatic);
      }
    }
  }

  /**
   * hi.
   * @param input is input.
   * @return in.
   */
  private static String convert(String input) {
    String head = "";
    String tail = "";
    for (int i = 0; i < input.length(); i++) {
      char x = input.charAt(i);
      if (x == '<') {
        head = input.substring(0, i);
        tail = input.substring(i + 1, input.length() - 1);
      }
    }
    if (head.isEmpty() || tail.isEmpty()) {
      return preConvert(input);
    }
    return preConvert(head) + "<" + preConvert(tail) + ">";
  }

  /**
   * hi.
   * @param input is input.
   * @return in.
   */
  private static String preConvert(String input) {
    for (int i = 0; i < 17; i++) {
      if (input.equals(data[i])) {
        return input;
      }
    }
    for (String s : getImport) {
      if (s.contains(input)) {
        return s;
      }
    }
    for (String aClass : getClass) {
      if (aClass.contains(input)) {
        return aClass;
      }
    }

    return "java.lang." + input;
  }

  /**
   * hi.
   * @param input is input.
   * @return in.
   */
  private static String handle(String input) {
    String name = "";
    String rest = "";
    for (int i = 0; i < input.length(); i++) {
      char post = input.charAt(i);
      if (post == '(') {
        name = input.substring(0, i + 1);
        rest = input.substring(i + 1, input.length() - 2);
      }
    }

    ArrayList<String> nameOfStatic = divString(rest);
    ArrayList<String> dataOfName = new ArrayList<>();
    for (int i = 0; i < nameOfStatic.size(); i += 2) {
      dataOfName.add(nameOfStatic.get(i));
    }

    for (int i = 0; i < dataOfName.size(); i++) {
      if (i != 0) {
        name += ",";
      }
      name += convert(dataOfName.get(i));
    }
    return name + ")";
  }

  public static void main(String[] args) throws FileNotFoundException {
    String url = "E:\\GitHub\\2021I_OOP\\src\\Week11\\PhanTichLapTrinh\\Test.java";
    FileInputStream fileInputStream = new FileInputStream(url);
    String input = "";
    Scanner sc = new Scanner(fileInputStream);
    while (sc.hasNextLine()) {
      String here = sc.nextLine() + "\n";
      input += here;
    }
    List<String> outPut = getAllFunctions(input);
    for (String s : outPut) {
      System.out.println(s);
    }
  }
}
