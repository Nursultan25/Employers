package com.company;

public class Main {

    public static void main(String[] args) {
        Specialist parker = new Specialist("Parker", 34, "122200");
        Specialist genta = new Specialist("Genta", 24, "123400");
        Specialist mike = new Specialist("Mike", 19, "321939");

        Developer patric = new Developer("Patric", 31, "2139592");
        Developer jake = new Developer("Jake", 23, "2339992");
        Developer paul = new Developer("Paul", 21, "219992");
        Developer george = new Developer("George", 34, "213999");

        Manager leo = new Manager("Leo", 53, "1222332");
        Manager kyle = new Manager("Kyle", 43, "1222332");

        CEO donald = new CEO("Donald", 46, "12060000");

        Object[] employers = new Object[] {parker, genta, mike, patric, jake, paul, george, leo, kyle, donald};

        for (int i=0;i <= employers.length;i++) {
            print((Coworker) employers[i]);
        }
    }

    private static void print(Coworker employ) {
        employ.goToVacation();
    }
}
