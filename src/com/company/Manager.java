package com.company;

public class Manager extends Coworker{
    public Manager(String name, int age, String salary) {
        super(name, age, salary);
    }

    @Override
    void goToVacation() {
        System.out.println("Im going to Thailand!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I want to fly to scotland");
    }
}
