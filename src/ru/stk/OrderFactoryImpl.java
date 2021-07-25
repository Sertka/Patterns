package ru.stk;

import com.sun.tools.corba.se.idl.constExpr.Or;

public class OrderFactoryImpl implements OrderFactory{
    static Long orderCount = 0L;
    @Override
    public Order createOrder() {
        orderCount++;
        return new Order(orderCount);
    }
}
