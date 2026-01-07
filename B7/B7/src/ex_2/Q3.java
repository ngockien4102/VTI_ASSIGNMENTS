package ex_2;

public class Q3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[10]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("sai index phan tu trong mang");
        }

    }
}
