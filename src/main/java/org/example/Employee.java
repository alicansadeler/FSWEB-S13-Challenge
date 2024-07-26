package org.example;

import java.util.Arrays;

// Yazılacak tüm sınıflardaki sınıf değişkenleri private olarak tanımlanmalı.
// her sınıf için getter & setter metodları yazılmalı.
// Her sınıfın toString() metodu ezilmeli.
// Her sınıf için en az bir tane constructor tanımlanmalı.
public class Employee {

   private int id;
   private String  fullName;
   private String email;
   private String password;
   private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthPlans = healthplans;
    }

    public String addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            return "Geçersiz index!";
        }

        if (healthPlans[index] != null) {
            return  "İlgili index dolu olduğu için kayıt yapamazsınız!";
        }

        healthPlans[index] = name;
        return "Sağlık Planı başarıyla eklendi!";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
