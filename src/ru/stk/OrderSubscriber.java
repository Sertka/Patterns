package ru.stk;

public interface OrderSubscriber {
    void inform(OrderService os, Object arg, String propertyChangedName);
}
