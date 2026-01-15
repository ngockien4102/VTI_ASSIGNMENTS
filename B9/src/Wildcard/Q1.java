package src.Wildcard;

public class Q1 {
    //    Question 1:
//    Tạo 1 class Salary để đại diện cho datatype là các số
//            a) Hãy config class Salary như sau: Salary <N> với N phải được extends từ Number.class
//    b) Tạo method để print ra salary hiện tại
    public static void main(String[] args) {
        Salary<Integer> salary1 = new Salary<>();
        salary1.salary(1);
    }
}

class Salary<T extends Number> {
    public void salary(T salary) {
        System.out.println(salary);
    }
}
