import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
  private String name;
  private int rollNumber;
  private String grade;

  public Student(String name, int rollNumber, String grade) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
  }
  public int getRollNumber() {
    return rollNumber;
  }
  @Override
  public String toString() {
    return "Name: " + name + ", Roll Number: + rollNumber + ", Grade: " + grade;
  }
}
class StudentManagementSystem {
  private List<Student> students;
   public StudentManagementSystem() {
     students = new ArrayList<>();
   }
  public void addStudent(Student student) {
    student.add(student);
  }
  public boolean removeStudent(int rollNumber) {
    for (Student student : students) {
      if (student.getRollNumber() == rollNumber) {
        student.remove(student);
        return true;
      }
    }
    return false;
  }
  public Student searchStudent(int rollNumber) {
    for (Student student : students) {
      if (student.getRollNumber() == rollNumber) {
        retuen student;
      }
    }
    retuen null;
  }

  public List<Student> getAllStudents() {
    retuen students;
  }
}

public class Student_management_system{
  Run|Debug
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  StudentManagementSystem sms = new StudentManagementSystem();

  while (true) {
    System.out.println(x:"1. Add Student");
    System.out.println(x:"2. Remove Student");
    System.out.println(x:"3. Search Student");       
    System.out.println(x:"4. Display All Students");
    System.out.println(x:"5. Exit");
    System.out.println(s:"Enter your choice: ");
    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        Scanner.nextLine();
        System.out.print(s:"Enter student name: ");
        String name = scanner.nextLine();
        System.out.print(s:"Enter roll number: ");
        int rollNumber = scanner.nextLine();
        scanner.nextLine();
        System.out.print(s:"Enter grade: ");
        String grade = scanner,nextLine();

        Student newStudent = new Student(name, rollNumber, grade);
        sms.addStudent(newStudent);
        System.out.println(x:"Student added.");
        break;

      case 2:
        System.out.print(s:"Enter roll number of student to remove: ");
        int rollToRemove = scanner.nextInt();
        boolean removed = sms.removeStudent(rollToRemove);
        if (removed) {
          System.out.println(x:"Student removed.");
        } else {
          System.out.println(x:"Student not found.");
        }
        break;
      case 3:
        System.out.print(s:"Enter roll number of student to search: ");
        int rollToSearch = scanner.nextInt();
        Student searchedStudent = sms.searchStudent(rollToSearch);
        if (searchedStudent != null) {
          System.out.println(x:"Student found:");
          System.out.println(searchedStudent);
        } else {
          System.out.println(x:"Students not found.");
        }
        break;

      case 4:
        List<Student> allStudent = sms.getAllStudents();
        if (allStudents.isEmpty()) {
          System.out.println(x:"No students to dispaly.");
        } else {
          System.out.println(x:"All Students:");
          for (Student student : allStudents) {
            System.out.println(student);
          }
        }
        break;

      case 5:
        System.out.println(x:"Exiting...");
        scanner.close();
        System.exit(status:0);
        break;
      default:
        System.out.println(x:"Invalid choice. Please choose again.");
        break;
    }
  }
}
}
        
        
        



  



