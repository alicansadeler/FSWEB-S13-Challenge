package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        // Company

        Company workintech = new Company(1, "Workintech", 1000000.0, new String[5]);

        // Healthplan'lar Employee'ler

        Healthplan basicPlan = new Healthplan(1, "Temel Sağlık Planı", Plan.BASIC);
        Healthplan midPlan = new Healthplan(2, "Orta Sağlık Planı", Plan.MID);
        Healthplan ultraPlan = new Healthplan(3, "Ultra Sağlık Planı", Plan.ULTRA);


        Employee ali = new Employee(1, "Ali Can", "ali@workintech.com", "password123", new String[1] );
        Employee veli = new Employee(2, "Veli", "veli@workintech.com", "password456", new String[1] );
        Employee can = new Employee(3, "Can", "can@workintech.com", "password789", new String[1] );
        Employee snoop = new Employee(4, "Snoop", "snoop@workintech.com", "password001", new String[1] );

                workintech.addEmployee(0, ali.getFullName());
                ali.addHealthPlan(0, basicPlan.getName());


                workintech.addEmployee(1, veli.getFullName());
                veli.addHealthPlan(0, ultraPlan.getName());

                workintech.addEmployee(2, can.getFullName());
                can.addHealthPlan(0, basicPlan.getName());

                workintech.addEmployee(3, snoop.getFullName());
                snoop.addHealthPlan(0, midPlan.getName());


        // Sonuçlar
        System.out.println("\nŞirket Bilgileri:");
        System.out.println(workintech);

        System.out.println("\nÇalışan Bilgileri:");
        System.out.println(ali);
        System.out.println(veli);
        System.out.println(can);
        System.out.println(snoop);



    }
}