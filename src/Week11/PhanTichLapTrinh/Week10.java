package Week11.PhanTichLapTrinh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Week10 {

  private static final ArrayList<String> defaultTypes = new ArrayList<>(Arrays.asList(
      "int", "double", "boolean", "char",
      "float", "long", "short", "bytes", "T[]"));

  private static boolean canScan = true;

  private static String packageName;
  private static ArrayList<String> classes;
  private static HashMap<String, String> imports;


  /**
   * hi.
   *
   * @param fileContent is file.
   * @return file.
   */
  public static List<String> getAllFunctions(String fileContent) {
    packageName = getPackage(fileContent);
    classes = getClasses(fileContent);
    imports = getImports(fileContent);
    imports.put("QueryAPI", "com.nordstrom.common.jdbc.utils.QueryAPI");
    imports.put("SProcAPI", "com.nordstrom.common.jdbc.utils.SProcAPI");
    imports.put("Param", "com.nordstrom.common.jdbc.Param");
    ArrayList<String> functions = getStatic(fileContent);
    for (int i = 0; i < functions.size(); i++) {
      functions.set(i, processFunction(functions.get(i)));
    }
    return functions;
  }

  /**
   * hi.
   *
   * @param scanner is sc.
   * @return sc.
   */
  private static String scan(Scanner scanner) {
    String input = scanner.next();
    switch (input) {
      case "//" -> {
        scanner.nextLine();
        canScan = true;
        return null;
      }
      case "/*", "/**" -> {
        canScan = false;
        return null;
      }
      case "*/", "**/" -> {
        canScan = true;
        return null;
      }
      default -> {
      }
    }
    if (canScan) {
      return input;
    } else {
      return null;
    }
  }

  /**
   * hi.
   *
   * @param fileContent is f.
   * @return f.
   */
  private static String getPackage(String fileContent) {
    Scanner scanner = new Scanner(fileContent);
    while (scanner.hasNext()) {
      String input = scan(scanner);
      if (input == null) {
        continue;
      }
      if (input.equals("package")) {
        String packageName = scanner.next();
        if (packageName.contains(";")) {
          packageName = packageName.substring(0, packageName.indexOf(";"));
        }
        return packageName;
      }
    }
    return "";
  }

  /**
   * hi.
   *
   * @param fileContent is f.
   * @return hi.
   */
  private static ArrayList<String> getClasses(String fileContent) {
    Scanner scanner = new Scanner(fileContent);
    ArrayList<String> classes = new ArrayList<>();
    while (scanner.hasNext()) {
      String input = scan(scanner);
      if (input == null) {
        continue;
      }
      if (input.equals("class")) {
        String className = scanner.next();
        if (className.contains(";")) {
          className = className.substring(0, className.indexOf(";"));
        }
        classes.add(className);
      }
    }
    return classes;
  }

  /**
   * hi.
   *
   * @param fileContent is f.
   * @return f.
   */
  private static HashMap<String, String> getImports(String fileContent) {
    Scanner scanner = new Scanner(fileContent);
    HashMap<String, String> imports = new HashMap<>();
    while (scanner.hasNext()) {
      String input = scan(scanner);
      if (input == null) {
        continue;
      }
      if (input.equals("import")) {
        if (scanner.hasNext()) {
          String importName = scanner.next();
          if (importName.equals("static")) {
            continue;
          }
          if (importName.contains(";")) {
            importName = importName.substring(0, importName.indexOf(";"));
          }
          String[] importNameSplit = importName.split("\\.");
          imports.put(importNameSplit[importNameSplit.length - 1], importName);
        }
      }
    }
    return imports;
  }

  /**
   * hi.
   *
   * @param fileContent is f.
   * @return f.
   */
  private static ArrayList<String> getStatic(String fileContent) {
    Scanner scanner = new Scanner(fileContent);
    ArrayList<String> functions = new ArrayList<>();
    while (scanner.hasNext()) {
      String input = scan(scanner);
      if (input == null) {
        continue;
      }
      if (input.equals("static")) {
        String functionName = "";
        while (scanner.hasNext()) {
          String input1 = scanner.next();
          if (!input1.equals("class") && !input1.equals("final")) {
            functionName += input1 + " ";
            if (functionName.contains(";")) {
              break;
            }
            if (functionName.contains("{")) {
              String output = functionName.replace("{", "").trim();
              if (!output.equals("")) {
                String[] t = output.split(" ", 2);
                if (t[0].contains("<")) {
                  functions.add(output.substring(Math.max(output.indexOf(">"),
                      output.indexOf("]")) + 1).trim());
                } else {
                  functions.add(t[1]);
                }
              }
              break;
            }

          } else {
            break;
          }
        }
      }
    }
    return functions;
  }

  /**
   * hi.
   *
   * @param s is s.
   * @return s.
   */
  private static String processFunction(String s) {
    String functionName = s.substring(0, s.indexOf("("));
    String functionParams = s.substring(s.indexOf("(") + 1, s.indexOf(")"));
    String[] functionParamsSplit = functionParams.split(",");
    ArrayList<String> params = new ArrayList<>();
    for (String value : functionParamsSplit) {
      String[] subSplit = value.trim().split(" ");
      params.add(subSplit[0].replace("...", ""));
    }
    for (int i = 0; i < params.size(); i++) {
      params.set(i, convertParams(params.get(i)));
    }
    return functionName + "(" + String.join(",", params) + ")";
  }

  /**
   * hi.
   *
   * @param typeName is t.
   * @return t.
   */
  private static String convertParams(String typeName) {
    if (typeName.contains("<")) {
      String dataStructure = typeName.substring(0, typeName.indexOf("<"));
      String dataStructureParams = typeName.substring(typeName.indexOf("<") + 1,
          typeName.indexOf(">"));
      String[] dataStructureParamsSplit = dataStructureParams.split(",");
      ArrayList<String> params = new ArrayList<>();
      for (String s : dataStructureParamsSplit) {
        String[] subSplit = s.trim().split(" ");
        params.add(subSplit[0].replace("...", ""));
      }
      for (int i = 0; i < params.size(); i++) {
        params.set(i, convertTypeName(params.get(i)));
      }
      return convertTypeName(dataStructure) + "<"
          + String.join(",", params) + ">";
    } else {
      return convertTypeName(typeName);
    }
  }

  /**
   * hi.
   *
   * @param typeName is t.
   * @return t.
   */
  private static String convertTypeName(String typeName) {
    if (typeName.length() <= 1) {
      return typeName;
    }
    if (defaultTypes.contains(typeName)) {
      return typeName;
    }
    if (imports.containsKey(typeName)) {
      return imports.get(typeName);
    } else if (classes.contains(typeName)) {
      return packageName + "." + typeName;
    } else {
      return "java.lang." + typeName;
    }
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
