package com.CPR.redHome.service.admin.order;

import com.CPR.redHome.dto.cart.OrderDto;

import java.util.List;

public interface OrderAdminService {

    // 전체 주문 조회
    List<OrderDto> SelectAllOrders();

    // orderId로 주문 조회
    OrderDto selectOrderByOrderId(int orderId);

    // 수정한 order update
    void updateOrder(OrderDto orderDto);
}