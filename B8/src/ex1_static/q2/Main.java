package ex1_static.q2;

import ex1_static.q1.Student;

public class Main {
    //    Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ lớp - dùng chung cho tất cả các student).
//    Hãy viết chương trình main() để mô tả các bước sau:
//



    public static void main(String[] args) {

        Student student = new Student(1, "nguyễn văn A", Student.getMoneyGroup());
        Student student2 = new Student(2, "nguyễn văn B", Student.getMoneyGroup());
        Student student3 = new Student(3, "nguyễn văn C", Student.getMoneyGroup());

        //        B1: Các Student sẽ nộp quỹ, mỗi Student 100k
        Student.setMoneyGroup(100 * 3);
        System.out.println("MoneyGroup: " + Student.getMoneyGroup() + "k");
        //    B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
        Student.setMoneyGroup(Student.getMoneyGroup() - 50);
        System.out.println("B1: " + Student.getMoneyGroup() + "k");
        //    B3: Student thứ 2 lấy 20k đi mua bánh mì
        Student.setMoneyGroup(Student.getMoneyGroup() - 20);
        System.out.println("B2: " + Student.getMoneyGroup() + "k");
        //    B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
        Student.setMoneyGroup(Student.getMoneyGroup() - 150);
        System.out.println("B3: " + Student.getMoneyGroup() + "k");
        //    B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
        Student.setMoneyGroup(Student.getMoneyGroup() + 50 * 3);
        System.out.println("B4: " + Student.getMoneyGroup() + "k");
        //    In ra số tiền còn của nhóm tại mỗi bước


        System.out.println("acc num: "+Student.getCount());
    }
}
