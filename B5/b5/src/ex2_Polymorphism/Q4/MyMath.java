package ex2_Polymorphism.Q4;

import java.util.Scanner;

public class MyMath {
    private int param1;
    private int param2;

    public MyMath(int param1, int param2) {
        this.param1 = param1;
        this.param2 = param2;
    }



    public int getParam1() {
        return param1;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public void tinhTong() {
        System.out.println("tong la: " + (param1 + param2));
    }

    //    Question 4:
//    Tạo 1 class MyMath có method sum có 2 parameter (có thể là int, có thể là byte, có thể là float), sau đó trả về tổng của 2 số đó. Hãy viết chương trình demo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tham so 1");
        String p1 = sc.nextLine();

        System.out.println("nhap tham so 2");
        String p2 = sc.nextLine();

        MyMath myMath = new MyMath(Integer.valueOf(p1),Integer.valueOf(p2));
        myMath.tinhTong();
    }
}
