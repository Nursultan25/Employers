package com.company;

public class Coworker {
    private String name;
    private int age;
    private String salary;

    @Override
    public String toString() {
        return "Coworker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Coworker(String name, int age, String salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
    }

    void goToVacation() {
        System.out.println("Im going to");
    }
}
