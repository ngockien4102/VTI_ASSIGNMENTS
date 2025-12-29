package ex2_Polymorphism.Q2;

import java.util.Scanner;

public class Student extends Persion{
    private String code;
    private double everageScore;
    private String email;

    public Student(String code, double everageScore, String email) {
        this.code = code;
        this.everageScore = everageScore;
        this.email = email;
    }

    public Student(String sex, String fullName, String birthDate, String address, String code, double everageScore, String email) {
        super(sex, fullName, birthDate, address);
        this.code = code;
        this.everageScore = everageScore;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public double getEverageScore() {
        return everageScore;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public Persion inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gioi tinh");
        String sex = scanner.nextLine();
        System.out.println("nhap ho va ten");
        String fullName = scanner.nextLine();
        System.out.println("nhap ngay sinh");
        String birthDate = scanner.nextLine();
        System.out.println("nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("nhap ma sinh vien");
        String code = scanner.nextLine();
        System.out.println("nhap diem trung binh");
        double everageScore = scanner.nextDouble();
        System.out.println("nhap email;");
        String mail = scanner.nextLine();
        Student student = new Student(sex,fullName,birthDate,address,code,everageScore,email);
        return student;
    }

    @Override
    public String showInfor(Persion persion) {
        Student student = (Student) persion;
        return "Student{" +
                "sex='" + persion.getSex() + '\'' +
                ", fullName='" + persion.getFullName() + '\'' +
                ", birthDate='" + persion.getBirthDate() + '\'' +
                ", address='" + persion.getAddress() + '\'' +
                "code='" + student.getCode() + '\'' +
                ", everageScore=" + student.getEverageScore() +
                ", email='" + student.getEmail() + '\'' +
                '}';
    }

    public void checkScore(Double score){
        if (score >= 8.0){
            System.out.println("duoc hoc bong");
        }else {
            System.out.println("truot hoc bong");
        }
    }
}
