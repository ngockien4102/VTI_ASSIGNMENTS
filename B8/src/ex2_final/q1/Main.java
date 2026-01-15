package ex2_final.q1;

class myMath {
    public static final double pi = 3.14;
}

public class Main {
    public static double sum(int a) {
        return a + myMath.pi;
    }

    public static void main(String[] args) {
        System.out.println(sum(9));
//        myMath.pi = 5;
    }
}
