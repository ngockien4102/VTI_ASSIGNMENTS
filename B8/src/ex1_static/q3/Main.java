package ex1_static.q3;

class myMath {

//        a) Viết class MyMath để thay thế cho class Math của java.
//    b) Viết thêm method min(), sum vào class MyMath
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
