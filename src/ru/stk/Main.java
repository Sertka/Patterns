package ru.stk;

import com.sun.tools.corba.se.idl.constExpr.Or;

public class Main {

    public static void main(String[] args) {
        // Создаем заказ
        Order o = new Order(1L);

        //Создаем сервис
        OrderService oService = new OrderService();

        //Создаем подписчика 1
        OrderSubscriber os1 = new OrderSubscriber() {
            @Override
            public void inform(OrderService os, Object o, String propertyChangedName) {
                System.out.println("S1: Новое значение свойства " + propertyChangedName + " - " + o);
            }
        };

        //Создаем подписчика 1
        OrderSubscriber os2 = new OrderSubscriber() {
            @Override
            public void inform(OrderService os, Object o, String propertyChangedName) {
                System.out.println("S2: Новое значение свойства " + propertyChangedName + " - " + o);
            }
        };

        oService.subscribe(os1);
        oService.subscribe(os2);

        oService.updateOrderStatus(o, 1);
        oService.updateOrderUser(o, 12L);
    }
}
