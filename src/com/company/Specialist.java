package com.company;

public class Specialist extends Coworker{
    public Specialist(String name, int age, String salary) {
        super(name, age, salary);
    }

    @Override
    void goToVacation() {
        System.out.println("Im going to Japan!");
    }
}
