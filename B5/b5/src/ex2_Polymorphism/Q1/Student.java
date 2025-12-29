package ex2_Polymorphism.Q1;

import java.util.List;

public class Student implements IStudent{
    private int id;
    private String name;
    private int group;

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void diemDanh(List<Student> students) {
        for (Student student: students){
            System.out.println(student.getName() + " diem danh");
        }
    }

    @Override
    public void hocBai(List<Student> students, int group) {
        for (Student student: students){
            if (student.getGroup() == group){
                System.out.println(student.getName() + " hoc bai");
            }
        }
    }

    @Override
    public void donVeSinh(List<Student> students, int group) {
        for (Student student: students){
            if (student.getGroup() == group){
                System.out.println(student.getName() + " don ve sinh");
            }
        }
    }
}
