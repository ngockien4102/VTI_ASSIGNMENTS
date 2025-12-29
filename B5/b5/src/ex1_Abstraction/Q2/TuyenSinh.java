package ex1_Abstraction.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    @Override
    public void tuyenSinh(List<Student> studentList, Scanner sc) {
        System.out.println("Số báo danh: ");
        String code = sc.nextLine();
        System.out.println("Họ tên: ");
        String fullName = sc.nextLine();
        System.out.println("Địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Mức ưu tiên: ");
        String priority = sc.nextLine();
        System.out.println("Khối thi: ");
        String examBlock = sc.nextLine();
        Student student = new Student(code, fullName, address, priority, examBlock);
        studentList.add(student);

    }

    @Override
    public void viewInfo(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void searchByCode(List<Student> studentList, Scanner sc) {
        System.out.println("Nhập số báo danh: ");
        String code = sc.nextLine();
        for (Student student : studentList) {
            if (student.getStudentCode().equals(code)) {
                System.out.println(student.toString());
            }
        }
    }


//    Question 2:
//    Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C. Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức ưu tiên.
//    Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
//    Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
//    Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
//
//            a) Xây dựng các class để quản lý các thi sinh dự thi đại học.
//    b) Xây dựng interface ITuyenSinh và class TuyenSinh có các chức năng:
//    a. Thêm mới thí sinh.
//    b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
//    c. Tìm kiếm theo số báo danh.
//    d. Thoát khỏi chương trình.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        List<Student> studentList = new ArrayList<>();
        do {
            System.out.println(" \t 1. Thêm mới thí sinh.\n" +
                    "            2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.\n" +
                    "            3. Tìm kiếm theo số báo danh.\n" +
                    "            4. Thoát khỏi chương trình.");

            System.out.println("Nhập lựa chọn: ");
            choose = sc.nextInt();
            sc.nextLine();
            TuyenSinh tuyenSinh = new TuyenSinh();
            switch (choose) {
                case 1:
                    tuyenSinh.tuyenSinh(studentList, sc);
                    break;
                case 2:
                    tuyenSinh.viewInfo(studentList);
                    break;
                case 3:
                    tuyenSinh.searchByCode(studentList, sc);
                    break;
                case 4:
                    sc.close();
                    break;
            }
        }while (choose != 4);

    }
}
