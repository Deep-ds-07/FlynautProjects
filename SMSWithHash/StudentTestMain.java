package SMSWithHash;

import java.util.Scanner;

public class StudentTestMain {
    public static void main(String[] args) {
        StudentHashIMPL studentIMPL = new StudentHashIMPL();
        System.out.println("<<<<<! Welcome To Student Management System With HashMap !>>>>>");
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Here are the Choices:");
            System.out.println("1. Add Student");
            System.out.println("2. View ALl Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit Application");
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    studentIMPL.addStudent();
                    break;
                case 2:
                    studentIMPL.viewStudent();
                    break;
                case 3:
                    System.out.println("Enter Student ID For Update : ");
                    int id = sc.nextInt();
                    studentIMPL.updateStudent(id);
                    break;
                case 4:
                    studentIMPL.deleteStudent();
                    break;
                case 5:
                    System.out.println("Thank You For Visiting Here🙏🙏");
                    break;
                default:
                    System.err.println("⚠️⚠️ERROR : Invalid Choice");
            }

        }while (choice != 6);
        sc.close();
    }
}
