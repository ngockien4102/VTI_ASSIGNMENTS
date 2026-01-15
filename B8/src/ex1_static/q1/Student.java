package ex1_static.q1;

public class Student {
    private int id;
    private String name;
    static String college;

    static double moneyGroup;

    static int count = 0;

    public Student() {
        if (count == 7){
            throw new RuntimeException("Chỉ được phép tạo tối đa 7 học sinh");
        }
        count++;
    }

    public Student(int id, String name, String college) {
        this();
        this.id = id;
        this.name = name;
        Student.college = college;
    }

    public Student(int id, String name, double moneyGroup) {
        this();
        this.id = id;
        this.name = name;
        Student.moneyGroup = moneyGroup;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getMoneyGroup() {
        return moneyGroup;
    }

    public static void setMoneyGroup(double moneyGroup) {
        Student.moneyGroup = moneyGroup;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' + ", college= '"+ Student.college + "\'"+
                '}';
    }
}
