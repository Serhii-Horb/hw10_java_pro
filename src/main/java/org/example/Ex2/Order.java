package org.example.Ex2;

public class Order {
    private String nameOfDish;


    public Order(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    @Override
    public String toString() {
        return "Order {" +
                "nameOfDish = '" + nameOfDish + '\'' +
                '}';
    }
}
