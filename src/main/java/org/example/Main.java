package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        // Company oluşturma (5 geliştirici kapasitesi ile)
        Company workintech = new Company(1, "Workintech", 1000000.0, new String[5]);

        // Employee'ler oluşturma
        Employee ali = new Employee(1, "Ali Can", "ali@workintech.com", "password123", new String[1]);
        Employee ayse = new Employee(2, "Ayşe Yılmaz", "ayse@workintech.com", "password456", new String[1]);

        // Company'e Employee ekleme
        System.out.println(workintech.addEmployee(0, ali.getFullName()));
        System.out.println(workintech.addEmployee(1, ayse.getFullName()));

        // Healthplan oluşturma
        Healthplan basicPlan = new Healthplan(1, "Temel Sağlık Planı", Plan.BASIC);

        // Employee'lere Healthplan ekleme
        System.out.println(ali.addHealthPlan(0, basicPlan.getName()));
        System.out.println(ayse.addHealthPlan(0, basicPlan.getName()));

        // Sonuçları yazdırma
        System.out.println("\nŞirket Bilgileri:");
        System.out.println(workintech);

        System.out.println("\nÇalışan Bilgileri:");
        System.out.println(ali);
        System.out.println(ayse);

        System.out.println("\nSağlık Planı Bilgileri:");
        System.out.println(basicPlan);
    }
}