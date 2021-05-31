package com.company.childs;

import com.company.parent.Coworker;

public class CEO extends Coworker {
    public CEO(String name, int age, String salary) {
        super(name, age, salary);
    }

    @Override
    public void goToVacation() {
        System.out.println("Im going to Russia!");
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need to go on a business trip");
    }
}
