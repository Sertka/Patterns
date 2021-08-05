package ru.stk;

public class OrderAdapter extends Order{
    public OrderAdapter(OrderDescription orderDesc) {
        super(orderDesc.getOrderId());
        switch (orderDesc.getUserName()){
            case ("Вася"):
                this.setUserId(1L);
                break;
            case ("Петя"):
                this.setUserId(2L);
                break;
            case ("Федя"):
                this.setUserId(3L);
                break;
        }
    }


}
