package com.felipesousa.aula.services;

import com.felipesousa.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double newValueOrder = 0.0;
        newValueOrder = (order.getBasic() < 100.00) ? 20.00 :
                (order.getBasic() >= 100.00 && order.getBasic() < 200.00) ? 12.00 :
                        0.0;
        return newValueOrder;
    }
}
