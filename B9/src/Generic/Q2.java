package src.Generic;

public class Q2 {
    public static  <T> void print(T a){
        System.out.println(a.toString());;
    }

    public static void main(String[] args) {
        Q2.print(3.14);
        Q2.print("qưerqwrqwer");
        Student<String> s=new Student<>();
        s.id="12123";
        s.name="xccvvdvs";
        print(s);
    }
}
