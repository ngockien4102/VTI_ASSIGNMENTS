package ex2_Polymorphism.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
//    Question 1: Interface Management
//    Tạo 1 class Student gồm các property id, name, group(int)
//    Tạo 1 interface IStudent bao gồm các method : điểmDanh(), họcBài(), đi dọn vệ sinh()
//    Class Student sẽ implement interface như sau:
//
//    Method điểm danh() sẽ in ra nội dung như sau:
//            "Nguyễn Văn A điểm danh"
//            "Nguyễn Văn B điểm danh"
//            "Nguyễn Văn C điểm danh"
//            ….
//    Method học Bài () sẽ in ra nội dung như sau:
//            "Nguyễn Văn A đang học bài"
//            "Nguyễn Văn B đang học bài "
//            "Nguyễn Văn C đang học bài "
//            …
//    Tương tự với các method còn lại
//    Hãy viết chương trình thực hiện các lệnh sau:
//    a) Tạo 10 học sinh, chia thành 3 nhóm
//    b) Kêu gọi cả lớp điểm danh.
//    c) Gọi nhóm 1 đi học bài
//    d) Gọi nhóm 2 đi dọn vệ sinh
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Student student = new Student(i, "nguyen van " + i, random.nextInt(1, 4));
            studentList.add(student);
        }

        System.out.println("1 Kêu gọi cả lớp điểm danh.\n" +
                "           2 Gọi nhóm 1 đi học bài\n" +
                "           3 Gọi nhóm 2 đi dọn vệ sinh");
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        do {
            System.out.println("Nhập lựa chọn");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    student.diemDanh(studentList);
                    break;
                case 2:
                    student.hocBai(studentList, 1);
                    break;
                case 3:
                    student.donVeSinh(studentList, 2);
                    break;
                case 4:
                    return;
            }
        } while (true);

    }
}
