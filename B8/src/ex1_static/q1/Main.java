package ex1_static.q1;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    Khai báo 1 class student có các thuộc tính id, name, college
//            Với college là static variable.
//    Hãy khởi tạo các student sau:
//    Student có id = 1, name ="Nguyễn Văn A"
//    Student có id = 2, name = " Nguyễn Văn B "
//    Student có id = 3, name = " Nguyễn Văn C "
//    Và tất cả các student này đều học ở "Đại học bách khoa".
//    Dùng vòng for để in ra thông tin các student
//    Sau đó hãy chuyển các student này sang "Đại học công nghệ"
//    Dùng vòng for để in ra thông tin các student
    public static void main(String[] args) {

        Student.college = "đại học bách khoa";

        Student student = new Student(1,"nguyễn văn A", Student.college);
        Student student2 = new Student(2,"nguyễn văn B",Student.college);
        Student student3 = new Student(3,"nguyễn văn C",Student.college);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);

        for (Student std : studentList){
            System.out.println(std.toString());
        }

        Student.college = "đại học công nghệ";
        for (Student std : studentList){
            System.out.println(std.toString());
        }
    }
}
