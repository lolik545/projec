package com.example.bvt.service;

import com.example.bvt.component.OrdersService;

import java.util.List;

public interface ServiceOrders {
     List<OrdersService> getAllOrderService();
     List<OrdersService> getOrderByIdClient(Long id);
     List<OrdersService> getOrderByIdToningANdService(Long id);
     List<OrdersService> getOrderByIdFilmsToning(Long id);
     void deleteOrderById(Long id);
void saveOrder(OrdersService ordersService);
}
