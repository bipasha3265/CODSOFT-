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

