package org.example;

public class Employee {
    private int id;
    private String name;
    private String departament;
    private Double salary;
    private int age;

    public Employee(int id, String name, String departament, Double salary, int age) {
        this.id = id;
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
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

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
