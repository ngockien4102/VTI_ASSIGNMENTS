package src.Generic;

import java.util.List;

public class Q5 {
    public static void main(String[] args) {

    }
}

class Employee<T>{
    private int id;
    private String name;
    private List<T> salaries;

    public Employee(int id, String name, List<T> salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public void print(Object obj){
        System.out.println(obj);
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

    public List<T> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<T> salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaries=" + salaries +
                '}';
    }
}
