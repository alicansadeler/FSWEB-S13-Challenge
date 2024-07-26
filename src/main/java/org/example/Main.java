package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

// Company Sınıfı için test senaryoları
        String[] developers = new String[5];

        Company company1 = new Company(1,"Workintech", 152.0, new String[]{"Ali Can Sadeler"});

        Company company2 = new Company(2, "Aselsan", -152.0, developers);
            company2.addEmployee(0, "Ali Can Sadeler");
            company2.addEmployee(5, "Hebele Hübele");
            company2.addEmployee(1, "Hebele Hübele");
            company2.addEmployee(0, "Hebele Hübele");
        System.out.println(company1.toString("developerNames"));
        System.out.println(company2.toString());

// healtplan sınıfı

        Healthplan healthplan1 = new Healthplan(1, "Ali Can", Plan.BASIC);
        System.out.println(healthplan1.toString());

// Employee sınıfı

        Employee employee1 = new Employee(1, "Ali Can Sadeler", "ali@gmail.com", "1234", new String[]{"BASIC"});
        System.out.println(employee1.toString());


    }
}