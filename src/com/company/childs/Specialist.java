package com.company.childs;

import com.company.parent.Coworker;

public class Specialist extends Coworker {
    public Specialist(String name, int age, String salary) {
        super(name, age, salary);
    }

    @Override
    public void goToVacation() {
        System.out.println("Im going to Japan!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need to clear my head");
    }
}
