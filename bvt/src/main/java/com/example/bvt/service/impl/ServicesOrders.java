package com.example.bvt.service.impl;

import com.example.bvt.component.FilmForTintingOrBooking;
import com.example.bvt.component.OrdersService;
import com.example.bvt.repository.RepositoryFilmForTintingOrBooking;
import com.example.bvt.repository.RepositoryOrdesServic;
import com.example.bvt.repository.RepositoryToningAndBooking;
import com.example.bvt.service.ServiceOrders;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicesOrders implements ServiceOrders {
private final RepositoryOrdesServic repositoryOrdesServic;
private final RepositoryToningAndBooking repositoryToningAndBooking;
private final RepositoryFilmForTintingOrBooking repositoryFilmForTintingOrBooking;
    @Override
    public List<OrdersService> getAllOrderService() {
        return repositoryOrdesServic.findAll();
    }

    @Override
    public List<OrdersService> getOrderByIdClient(Long id) {
        List<OrdersService>ordersServiceList=new ArrayList<>();
        List<OrdersService>ordersList=new ArrayList<>();
        ordersServiceList.addAll(repositoryOrdesServic.findAll());
        if (ordersServiceList.size()>0){
            for(int i=0;i<=ordersServiceList.size()-1;i++){
                if(ordersServiceList.get(i).getIdClient().hashCode()==id.hashCode()){
                    ordersList.add(ordersServiceList.get(i));
                }
            }return ordersList;
        } return null;
    }

    @Override
    public List<OrdersService> getOrderByIdToningANdService(Long id) {
        List<OrdersService>ordersServiceList=new ArrayList<>();
        List<OrdersService>ordersList=new ArrayList<>();
        ordersServiceList.addAll(repositoryOrdesServic.findAll());
        if (ordersServiceList.size()>0){
            for(int i=0;i<=ordersServiceList.size()-1;i++){
                if(ordersServiceList.get(i).getIdToningAndBoking().hashCode()==id.hashCode()){
                    ordersList.add(ordersServiceList.get(i));
                }
            }return ordersList;
        } return null;
    }

    @Override
    public List<OrdersService> getOrderByIdFilmsToning(Long id) {

        List<OrdersService>ordersServiceList=new ArrayList<>();
        List<OrdersService>ordersList=new ArrayList<>();
        ordersServiceList.addAll(repositoryOrdesServic.findAll());
        if (ordersServiceList.size()>0){
        for(int i=0;i<=ordersServiceList.size()-1;i++){
            if(ordersServiceList.get(i).getIdFilmForTinigOrBooking().hashCode()==id.hashCode()){
                ordersList.add(ordersServiceList.get(i));
            }
        }return ordersList;
    } return null;
    }


    @Override
    public void deleteOrderById(Long id) {
        OrdersService ordersService=new OrdersService();
        ordersService=repositoryOrdesServic.getOne(id);
        if (ordersService.isTheOrderIsComplete()==true)
            repositoryOrdesServic.deleteById(id);
        }

    @Override
    public void saveOrder(OrdersService ordersService) {
    if (repositoryToningAndBooking.findById(ordersService.getIdToningAndBoking()).isPresent()){

        if(repositoryFilmForTintingOrBooking.findById(ordersService.getIdFilmForTinigOrBooking())!=null){
       ServiceFilmForTintingOrBookings serviceFilmForTintingOrBookings=new ServiceFilmForTintingOrBookings();
       FilmForTintingOrBooking filmForTintingOrBooking=repositoryFilmForTintingOrBooking.getOne(ordersService.getIdToningAndBoking());
       filmForTintingOrBooking.setSquareMeter(filmForTintingOrBooking.getSquareMeter()-ordersService.getSqurareMeters());
       serviceFilmForTintingOrBookings.save(filmForTintingOrBooking);
        repositoryOrdesServic.save(ordersService);

    }}
}

    @Override
    public OrdersService getOrderById(Long id) {
       return repositoryOrdesServic.getOne(id);
    }
}
