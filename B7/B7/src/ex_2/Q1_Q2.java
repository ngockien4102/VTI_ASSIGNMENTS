package ex_2;

public class Q1_Q2 {
    public static float divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        try {
            float rs = divide(7,0);
            System.out.println(rs);
        }catch (ArithmeticException e){
            System.out.println("can not divide 0");
        }finally {
            System.out.println("divide completed!");
        }
    }
}
