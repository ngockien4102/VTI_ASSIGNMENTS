package Ex1;

public class Department {

    private int id = 0;
    private String nameDepartment;

    public Department(){
    }

    public Department(String nameDepartment){
        this.nameDepartment = nameDepartment;
    }

    public static void main(String[] args) {
        Department department = new Department();
        Department department1 = new Department("tesst");
    }
}
