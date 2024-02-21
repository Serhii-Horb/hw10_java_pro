package org.example.Ex1;

import java.util.Objects;

public class Ticket implements Comparable<Ticket> {
    private int ticketNumber;
    private String surname;
    private String name;
    private int yearOfBirth;
    private TypesOfOperations operations;

    public Ticket(int ticketNumber, String surname, String name, int yearOfBirth, TypesOfOperations operations) {
        this.ticketNumber = ticketNumber;
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.operations = operations;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public TypesOfOperations getOperations() {
        return operations;
    }

    public void setOperations(TypesOfOperations operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "ticketNumber = " + ticketNumber +
                ", surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", yearOfBirth = " + yearOfBirth +
                ", operations = " + operations +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (ticketNumber != ticket.ticketNumber) return false;
        if (yearOfBirth != ticket.yearOfBirth) return false;
        if (!Objects.equals(surname, ticket.surname)) return false;
        if (!Objects.equals(name, ticket.name)) return false;
        return operations == ticket.operations;
    }

    @Override
    public int hashCode() {
        int result = ticketNumber;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + yearOfBirth;
        result = 31 * result + (operations != null ? operations.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Ticket o) {
        return Integer.compare(this.ticketNumber, o.ticketNumber);
    }
}
