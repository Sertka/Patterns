package ru.stk;

import com.sun.tools.corba.se.idl.constExpr.Or;

public class Main {

    public static void main(String[] args) {
        // Создаем объект-описание
        OrderDescription od = new OrderDescription();
        od.setOrderId(1L);
        od.setUserName("Вася");

        //Создаем адаптер
        OrderAdapter oa = new OrderAdapter(od);
        System.out.println(oa.getUserId());

        //Запускаем обновление пользователя в заказе
        OrderService os = new OrderService();
        Order o = os.updateOrderUser(oa, 5L);
        System.out.println(o.getUserId());
    }
}
