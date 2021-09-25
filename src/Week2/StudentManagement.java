package Week2;

public class StudentManagement {

  private final Student[] students = new Student[100];

  /**
   * sameGroup is checked relationship of group.
   * @param s1 is group of student 1.
   * @param s2 is group of student 2.
   * @return
   */
  public static boolean sameGroup(Student s1, Student s2) {
    String group1 = s1.getGroup();
    String group2 = s2.getGroup();
    return group1.equals(group2);
  }

  /**
   * addStudent.
   * @param newStudent is new student.
   */
  public void addStudent(Student newStudent) {
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        students[i] = newStudent;
        break;
      }
    }
  }

  /**
   * get students by group.
   * @return students by group.
   */
  public String studentsByGroup() {
    StringBuilder ans = new StringBuilder();
    String[] arraygroup = new String[100];
    int narraygroup = 1;
    arraygroup[0] = students[0].getGroup();

    for (Student student : students) {
      if (student == null) {
        break;
      }
      boolean found = false;
      String groupstudent = student.getGroup();
      for (int j = 0; j < narraygroup; j++) {
        if (arraygroup[j].equals(groupstudent)) {
          found = true;
          break;
        }
      }
      if (found) {
        continue;
      }
      arraygroup[narraygroup] = groupstudent;
      narraygroup++;
    }
    for (int i = 0; i < narraygroup; i++) {
      String groupcmp = arraygroup[i];
      ans.append(groupcmp).append("\n");
      for (Student student : students) {
        if (student == null) {
          break;
        }
        String groupstudent = student.getGroup();
        if (groupcmp.equals(groupstudent)) {
          ans.append(student.getInfo()).append("\n");
        }
      }
    }
    return ans.toString();
  }

  /**
   * remove student.
   * @param id is an id.
   */
  public void removeStudent(String id) {
    for (int i = 0; i < students.length; i++) {
      String idstudent = students[i].getId();
      if (idstudent.equals(id)) {
        for (; i < students.length - 1; i++) {
          students[i] = students[i + 1];
        }
      }
    }
  }

  public static void main(String[] args) {
    Student nguoi1 = new Student();
    nguoi1.setName("Nguyen Van An");
    nguoi1.setId("17020001");
    nguoi1.setGroup("K62CC");
    nguoi1.setEmail("17020001@vnu.edu.vn");
    String ans = nguoi1.getInfo();
    System.out.println(ans);

    Student nguoi2 = new Student();
    ans = nguoi2.getInfo();
    System.out.println(ans);

    Student nguoi3 = new Student("Nguyen Tan Minh","20020081","20020081@vnu.edu.vn");
    ans = nguoi3.getInfo();
    System.out.println(ans);

    Student nguoi4 = new Student(nguoi1);
    ans = nguoi4.getInfo();
    System.out.println(ans);

    boolean abcx = sameGroup(nguoi1,nguoi4);
    System.out.println(abcx);

    StudentManagement nguoi5 = new StudentManagement();

    nguoi5.addStudent(nguoi1);
    nguoi5.addStudent(nguoi2);
    nguoi5.addStudent(nguoi3);
    nguoi5.addStudent(nguoi4);


    String kq = nguoi5.studentsByGroup();
    System.out.println(kq);

    nguoi5.removeStudent("20020081");
    kq = nguoi5.studentsByGroup();
    System.out.println(kq);
  }
}
