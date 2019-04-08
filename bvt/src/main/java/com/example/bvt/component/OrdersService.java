package com.example.bvt.component;

import com.example.bvt.modelDTO.OrdersServiceDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class OrdersService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idToningAndBoking;
    private Long idFilmForTinigOrBooking;
    private Long idClient;
    private Integer squrareMeters;
    private boolean theOrderIsComplete ;

    public void OrdersService() {

    }

    public void OrdersSevice(OrdersServiceDTO ordersServiceDTO){
    this.idToningAndBoking=ordersServiceDTO.getIdToningAndBoking();
    this.idFilmForTinigOrBooking=ordersServiceDTO.getIdFilmForTinigOrBooking();
    this.idClient=ordersServiceDTO.getIdClient();
    this.theOrderIsComplete=ordersServiceDTO.isTheOrderIsComplete();
this.squrareMeters=ordersServiceDTO.getSqurareMeters();
    }
}
