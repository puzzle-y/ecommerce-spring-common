package com.ecommerce.common.event.order;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderPaidEvent extends OrderEvent {
    public OrderPaidEvent(String orderId) {
        super(orderId);
    }

}
