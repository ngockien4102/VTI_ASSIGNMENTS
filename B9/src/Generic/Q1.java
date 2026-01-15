package src.Generic;

public class Q1 {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<Integer>();
        s1.id = 1;
        s1.name = "ádfas";

        Student<Double> s2 = new Student<>();
        s2.id = 1D;
        s2.name = "àasdfsfd";
    }
}

class Student<T> {
    T id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}