package org.example.Ex2;

public class Cook {
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cooking(Order cook) {
        System.out.println("Я готовлю " + cook);
    }
}
