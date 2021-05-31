package com.company.childs;

import com.company.parent.Coworker;

public class Developer extends Coworker {
    public Developer(String name, int age, String salary) {
        super(name, age, salary);
    }

    @Override
    public void goToVacation() {
        System.out.println("Im going to Miami!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need family leave");
    }
}
