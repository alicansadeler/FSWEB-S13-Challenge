package org.example.enums;

public enum Plan {
    // plan(enum) : variable name & price.  BASIC zorunlu plan. org.example altında " enums " paketi oluştur.

    BASIC("Basic Plan", 300),
    MID("Mid Plan", 800),
    ULTRA("Ultra Plan", 1200);

    String name;
    int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

