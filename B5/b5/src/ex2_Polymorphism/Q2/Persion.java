package ex2_Polymorphism.Q2;

import java.util.Scanner;

public class Persion {
    private String sex;
    private String fullName;
    private String birthDate;
    private String address;

    public Persion() {
    }

    public Persion(String sex, String fullName, String birthDate, String address) {
        this.sex = sex;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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
        Persion persion = new Persion(sex,fullName,birthDate,address);
        return persion;
    }

    public String showInfor(Persion persion) {
        return "Persion{" +
                "sex='" + sex + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
