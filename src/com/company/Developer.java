package com.company;

public class Developer extends Coworker{
    public Developer(String name, int age, String salary) {
        super(name, age, salary);
    }

    @Override
    void goToVacation() {
        System.out.println("Im going to Miami!");
    }
}
