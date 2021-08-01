package ru.stk;

public class OrderService {

    public Order updateOrderUser(Order o, Long newUserId){
        System.out.println("New UserID update in DB:" + newUserId);
        o.setUserId(newUserId);
        return o;
    }
}
