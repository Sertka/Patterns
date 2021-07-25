package ru.stk;

import com.sun.tools.corba.se.idl.constExpr.Or;

public class Main {

    public static void main(String[] args) {
    OrderFactory orderFactory = new OrderFactoryImpl();
        Order o1 = orderFactory.createOrder();
        Order o2 = orderFactory.createOrder();

        System.out.println(o1.getId());
        System.out.println(o2.getId());

    }
}
