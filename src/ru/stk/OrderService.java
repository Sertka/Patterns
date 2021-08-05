package ru.stk;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    //реализуем паттерн Subscriber
    private List<OrderSubscriber> osList = new ArrayList<>();

    public void subscribe(OrderSubscriber os){
        osList.add(os);
    }

    public void unsubscribe(OrderSubscriber os){
        osList.remove(os);
    }

    public Order updateOrderUser(Order o, Long newUserId){
        System.out.println("New UserID update in DB:" + newUserId);
        o.setUserId(newUserId);
        //информируем подписчиков
        for (OrderSubscriber os: osList){
            os.inform(this, newUserId, "UserId");
        }
        return o;
    }

    public Order updateOrderStatus(Order o, Integer newStatus){
        System.out.println("New Order Status updated in DB:" + newStatus);
        o.setStatus(newStatus);
            for (OrderSubscriber os: osList){
                //информируем подписчиков
                os.inform(this, newStatus, "Status");
            }
        return o;
    }
}
