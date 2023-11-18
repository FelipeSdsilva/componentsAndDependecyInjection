package com.felipesousa.aula.services;

import com.felipesousa.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double totalOrder = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) + shippingService.shipment(order);
        order.setBasic(totalOrder);
        return totalOrder;
    }
}
