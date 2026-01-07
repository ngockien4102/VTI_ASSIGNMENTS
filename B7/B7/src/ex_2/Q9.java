package ex_2;

import java.util.Scanner;

public class Q9 {
    private Scanner scanner;
    private String name;
    private int age;

    public Q9(String name, int age) {
        this.name = ScannerUtils.inputString();
        this.age = ScannerUtils.inputInt("nhap sai tuoi");
    }
}
