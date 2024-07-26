package org.example;
// Yazılacak tüm sınıflardaki sınıf değişkenleri private olarak tanımlanmalı.
// her sınıf için getter & setter metodları yazılmalı.
// Her sınıfın toString() metodu ezilmeli.
// Her sınıf için en az bir tane constructor tanımlanmalı.


import org.example.enums.Plan;

public class Healthplan {
   // instance variable = id name plan(enum)
   // plan(enum) : variable name & price.  BASIC zorunlu plan. org.example altında " enums " paketi oluştur.


    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    private int id;
    private String name;
    private Plan plan;

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

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}