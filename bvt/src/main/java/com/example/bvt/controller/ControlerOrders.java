package com.example.bvt.controller;

import com.example.bvt.component.OrdersService;
import com.example.bvt.modelDTO.OrdersServiceDTO;
import com.example.bvt.service.ServiceOrders;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControlerOrders {
private final ServiceOrders serviceOrders;
    @PostMapping("/saveOrder")
    public ResponseEntity saveOrders(@RequestBody OrdersService ordersService){
        serviceOrders.saveOrder(ordersService);
        return ResponseEntity.ok("Saved"+ordersService);
    }
@PostMapping("/cahgeOrdersForId/{id}")
public ResponseEntity changeOrdersById (@PathVariable Long id){
OrdersService ordersService=new OrdersService();
ordersService= serviceOrders.getOrderById(id);
ordersService.setTheOrderIsComplete(true);
serviceOrders.saveOrder(ordersService);
return ResponseEntity.ok("change");
    }
     @PostMapping("/getAllOrdersClientID/{id}")
    public ResponseEntity getAllOrdersClientId(@PathVariable Long id){
     return ResponseEntity.ok(   serviceOrders.getOrderByIdClient(id));
     }
@PostMapping("/getAllOrdersToning/{id}")
public ResponseEntity getAllOrdersByToningAndBooking(@PathVariable Long id){
        return ResponseEntity.ok(serviceOrders.getOrderByIdToningANdService(id));
}
@PostMapping("/getAllOrdersByFilmID/{id}")
    public ResponseEntity getAllOrdersByFilmId(@PathVariable Long id){
        return ResponseEntity.ok(serviceOrders.getOrderByIdFilmsToning(id));
}
}
