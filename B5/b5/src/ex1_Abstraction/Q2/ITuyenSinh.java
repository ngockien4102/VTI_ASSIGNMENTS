package ex1_Abstraction.Q2;

import java.util.List;
import java.util.Scanner;

public interface ITuyenSinh {
    public void tuyenSinh(List<Student> studentList, Scanner sc);
    public void viewInfo(List<Student> students);
    public void searchByCode(List<Student> studentList, Scanner sc);

}
