package com.company.childs;

import com.company.parent.Coworker;

public class Manager extends Coworker {
    public Manager(String name, int age, String salary) {
        super(name, age, salary);
    }

    @Override
    public void goToVacation() {
        System.out.println("Im going to Thailand!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I want to fly to scotland");
    }
}
