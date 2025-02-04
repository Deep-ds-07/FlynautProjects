package SMSWithHash;

public interface StudentInterface {
    void addStudent();
    void viewStudent();
    void updateStudent(int studentId);
    void deleteStudent();
    public Student findStudentById(int studentId);

}
