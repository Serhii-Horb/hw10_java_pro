package org.example.Ex2;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* В ресторане официанты подают заказы Order на кухню. Очень важно чтобы заказы брались в работу поварами строго в
том порядке, в котором они были переданы на кухню. Создайте множество (Set) заказов, которые будут передаваться на
кухню официантом и реализуйте механизм взятия в работу этих заказом поваром. Используйте LinkedHashSet для решения
этой задачи. Характеристики Order определите самостоятельно. */

public class Restaurant {
    public static void main(String[] args) {
        LinkedHashSet<Order> orders = new LinkedHashSet<>();
        Waiter waiter1 = new Waiter("Tolik", new Order("Fish"));
        Waiter waiter2 = new Waiter("Stepan", new Order("Meat"));
        Waiter waiter3 = new Waiter("Oleg", new Order("Salad"));

        orders.add(waiter1.getOrder());
        orders.add(waiter2.getOrder());
        orders.add(waiter3.getOrder());

        System.out.println(orders);

        Cook cook1 = new Cook("Stepan");

        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()){
            cook1.cooking(iterator.next());
        }
    }
}
