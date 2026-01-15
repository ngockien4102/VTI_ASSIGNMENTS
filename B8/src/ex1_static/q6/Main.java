package ex1_static.q6;

import ex1_static.q1.Student;

public class Main {

//    Question 6: tiếp tục Question 5
//    Tạo class PrimaryStudent, SecondaryStudent, hãy viết chương trình đếm số lượng PrimaryStudent được sinh ra, SecondaryStudent được sinh ra.
//    Viết chương trình demo.
//    Khởi tạo 6 Student, trong đó có 2 PrimaryStudent và 4 SecondaryStudent, sau đó in ra số lượng Student, PrimaryStudent, SecondaryStudent được sinh ra.
    public static void main(String[] args) {
        PrimaryStudent primaryStudent1 = new PrimaryStudent();
        PrimaryStudent primaryStudent2 = new PrimaryStudent();
        SecondaryStudent secondaryStudent = new SecondaryStudent();
        SecondaryStudent secondaryStudent2 = new SecondaryStudent();
        SecondaryStudent secondaryStudent3 = new SecondaryStudent();
        SecondaryStudent secondaryStudent4 = new SecondaryStudent();
//        SecondaryStudent secondaryStudent5 = new SecondaryStudent();
//        SecondaryStudent secondaryStudent6 = new SecondaryStudent();

        System.out.println("PrimaryStudent: " + PrimaryStudent.count);
        System.out.println("SecondaryStudent: " + SecondaryStudent.count);
        System.out.println("Student: " + Student.getCount());
    }
}
