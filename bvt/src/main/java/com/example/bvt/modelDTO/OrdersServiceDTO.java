package com.example.bvt.modelDTO;

import com.example.bvt.component.OrdersService;


public class OrdersServiceDTO {
    private Long id;
    private Long idToningAndBoking;
    private Long idFilmForTinigOrBooking;
    private Long idClient;

    private Integer squrareMeters;
    private boolean theOrderIsComplete;
public OrdersServiceDTO (){}
    public OrdersServiceDTO(OrdersService orderService) {
            this.idClient = orderService.getIdClient();
        this.idToningAndBoking = orderService.getIdToningAndBoking();
        this.idFilmForTinigOrBooking = orderService.getIdFilmForTinigOrBooking();
        this.theOrderIsComplete = true;
    }

    public boolean isTheOrderIsComplete() {
        return theOrderIsComplete;
    }


    public void setTheOrderIsComplete(boolean theOrderIsComplete) {
        this.theOrderIsComplete = theOrderIsComplete;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdFilmForTinigOrBooking() {
        return idFilmForTinigOrBooking;
    }

    public void setIdFilmForTinigOrBooking(Long idFilmForTinigOrBooking) {
        this.idFilmForTinigOrBooking = idFilmForTinigOrBooking;
    }

    public Long getIdToningAndBoking() {
        return idToningAndBoking;
    }

    public void setIdToningAndBoking(Long idToningAndBoking) {
        this.idToningAndBoking = idToningAndBoking;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSqurareMeters() {
        return squrareMeters;
    }

    public void setSqurareMeters(Integer squrareMeters) {
        this.squrareMeters = squrareMeters;
    }
}
