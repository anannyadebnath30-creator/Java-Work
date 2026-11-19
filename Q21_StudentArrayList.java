import java.util.ArrayList;
import java.util.Scanner;

class StudentRecord {
    int rollNo;
    String name;
    double marks;

    StudentRecord(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Q21_StudentArrayList {
    static StudentRecord findStudent(ArrayList<StudentRecord> students, int rollNo) {
        for (StudentRecord s : students) {
            if (s.rollNo == rollNo) return s;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentRecord> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add  2.Search  3.Update  4.Delete  5.Display  6.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Roll number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();
                    if (findStudent(students, roll) != null) {
                        System.out.println("Roll number already exists.");
                    } else {
                        students.add(new StudentRecord(roll, name, marks));
                        System.out.println("Student added.");
                    }
                    break;
                case 2:
                    System.out.print("Enter roll number to search: ");
                    StudentRecord found = findStudent(students, sc.nextInt());
                    System.out.println(found == null ? "Student not found." : found);
                    break;
                case 3:
                    System.out.print("Enter roll number to update: ");
                    StudentRecord update = findStudent(students, sc.nextInt());
                    sc.nextLine();
                    if (update == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.print("New name: ");
                        update.name = sc.nextLine();
                        System.out.print("New marks: ");
                        update.marks = sc.nextDouble();
                        System.out.println("Student updated.");
                    }
                    break;
                case 4:
                    System.out.print("Enter roll number to delete: ");
                    int deleteRoll = sc.nextInt();
                    StudentRecord remove = findStudent(students, deleteRoll);
                    if (remove == null) System.out.println("Student not found.");
                    else {
                        students.remove(remove);
                        System.out.println("Student deleted.");
                    }
                    break;
                case 5:
                    if (students.isEmpty()) System.out.println("No student records.");
                    else for (StudentRecord s : students) System.out.println(s);
                    break;
                case 6:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
