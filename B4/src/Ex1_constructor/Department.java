package Ex1_constructor;

public class Department {

    private int id;
    private String nameDepartment;

    public Department(){
    }

    public Department(String nameDepartment){
        this.nameDepartment = nameDepartment;
        this.id = 0;
    }

    public static void main(String[] args) {
        Department department = new Department();
        Department department1 = new Department("tesst");
    }
}
