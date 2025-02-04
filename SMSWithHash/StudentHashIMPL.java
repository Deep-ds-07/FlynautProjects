package SMSWithHash;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHashIMPL implements StudentInterface{
    HashMap<Integer, Student> studentHash = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        System.out.println("Enter Student ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Student Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Course : ");
        String course = sc.nextLine();

        System.out.println("Enter Student Grade : ");
        int grade = sc.nextInt();  // ✅ Read grade as int

        Student student = new Student(id, name, course, age, grade);  // ✅ Fixed constructor
        studentHash.put(id, student);

        System.out.println("✅ Student Added Successfully!");
    }

    @Override
    public void viewStudent() {

        if (studentHash.isEmpty()){
            System.out.println("No Student To Display or Not Any student added ");
        }else {
            for (Student std : studentHash.values()){
                System.out.println(std);
            }
        }

    }

    @Override
    public void updateStudent(int studentId) {
        Student student = findStudentById(studentId);
        if (student != null){
            System.out.println("Updating Student Info...");
            System.out.println("What You Want To Update In Student");
            System.out.println("1. All Update");
            System.out.println("2. Only Update Name");
            System.out.println("3. Only Update Age");
            System.out.println("4. Only Update Course");
            System.out.println("5. Only Update Grade");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter Student New Name : ");
                    student.setName(sc.nextLine());

                    System.out.println("Enter Student New Age : ");
                    student.setAge(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Enter Student New Course : ");
                    student.setCourse(sc.nextLine());

                    System.out.println("Enter Student New Grade : ");
                    student.setGrade(sc.nextInt());
                    sc.nextLine();
                    break;

                case 2:
                    System.out.println("Enter Student New Name : ");
                    student.setName(sc.nextLine());
                    break;

                case 3:
                    System.out.println("Enter Studendt New Age : ");
                    student.setAge(sc.nextInt());
                    sc.nextLine();
                    break;

                case 4:
                    System.out.println("Enter Student New Course : ");
                    student.setCourse(sc.nextLine());
                    break;

                case 5:
                    System.out.println("Enter Student New Grade : ");
                    student.setGrade(sc.nextInt());
                    sc.nextLine();
                    break;

                default:
                    System.err.println("⚠️ERROR : Invalid Choice ");
                    return;
            }
            System.out.println("✔️Student Updated Successfully‼️‼️");
        }else {
            System.err.println("⚠️ERROR : Student Not Found");
        }

    }

    @Override
    public void deleteStudent() {
        System.out.println("Enter Student Id For Delete :");
        int deleteId = sc.nextInt();

         // Student student = findStudentById(studentId);// remove this object

        if (studentHash.containsKey(deleteId)){
            studentHash.remove(deleteId);
        }else {
            System.err.println("⚠️ERROR : Student Not Found");
        }
    }

    @Override
    public Student findStudentById(int studentId) {
        return studentHash.get(studentId);
    }
}
