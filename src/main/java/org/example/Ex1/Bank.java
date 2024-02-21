package org.example.Ex1;
/* Вы пришли в отделение банка, в котором обслуживание ведется строго по талончикам, который Вы получаете в автомате
при входе. При регистрации, Вы обязательно указываете ФИО, год рождения, тип операции который Вам необходимо
выполнить в отделении (например Консультация, Получение денежных средств, Вложение средств, Открытие депозита,
Коммунальные платежи).
После регистрации - вы получаете номер талончика.
Обслуживание в банке ведется строго по номеру талончика в порядке их возрастания.
Создать множество, которое будет обслуживать класс Ticket.
Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
Сымитируйте работу отделения банка. */

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Bank {
    private static int count;

    public static void main(String[] args) {

        SortedSet<Ticket> ticketSortedSet = new TreeSet<>();
        ticketSortedSet.add(registration("Petrov", "Petia", 1955, TypesOfOperations.CLOSING_DEPOSIT));
        ticketSortedSet.add(registration("Ivanov", "Tolia", 1967, TypesOfOperations.OPENING_DEPOSIT));
        ticketSortedSet.add(registration("Sidorov", "Anton", 1995, TypesOfOperations.COMMUNAL_PAYMENTS));
        ticketSortedSet.add(registration("Zubova", "Olia", 1999, TypesOfOperations.CONSULTATION));
        ticketSortedSet.add(registration("Tupova", "Sveta", 2000, TypesOfOperations.INVESTMENT));

        bankService(ticketSortedSet);
    }

    public static Ticket registration(String surname, String name, int yearOfBirth, TypesOfOperations operations) {
        return new Ticket(++count, surname, name, yearOfBirth, operations);
    }

    public static void bankService(SortedSet<Ticket> set) {
        Iterator<Ticket> iterator = set.iterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            System.out.println("Пользователю " + ticket.getSurname() + " предоставлена услуга " + ticket.getOperations());
        }
    }
}
