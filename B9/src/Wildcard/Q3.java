package Wildcard;

public class Q3 {
    public static <T extends Number & Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) == 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(Q3.max(1.123,2.455));
    }
}
