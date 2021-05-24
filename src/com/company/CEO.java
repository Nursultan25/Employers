package com.company;

public class CEO extends Coworker {
    public CEO(String name, int age, String salary) {
        super(name, age, salary);
    }

    @Override
    void goToVacation() {
        System.out.println("Im going to Russia!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need to go on a business trip");
    }
}
