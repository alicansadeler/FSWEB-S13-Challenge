package org.example;

import java.util.Arrays;

// Yazılacak tüm sınıflardaki sınıf değişkenleri private olarak tanımlanmalı.
// her sınıf için getter & setter metodları yazılmalı.
// Her sınıfın toString() metodu ezilmeli.
// Her sınıf için en az bir tane constructor tanımlanmalı.
public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro negatif değer alamaz!");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

    public String toString(String information) {
        switch (information) {
            case "developerNames":
                return "developerNames = " + Arrays.toString(developerNames);
            case "name":
                return "name = " + name;
            case "giro":
                return "giro = " + giro;
            default:
                return toString();
        }
    }

    public String addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index!");
            return "Geçersiz index!";
        }

        if (developerNames[index] != null) {
            System.out.println("İlgili index dolu olduğu için kayıt yapamazsınız!");
            return "İlgili index dolu olduğu için kayıt yapamazsınız!";
        }

        developerNames[index] = name;
        System.out.println("Developer başarıyla eklendi!");
        return "Developer başarıyla eklendi!";
    }
}
