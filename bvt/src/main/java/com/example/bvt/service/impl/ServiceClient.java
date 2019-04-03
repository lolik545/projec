package com.example.bvt.service.impl;

import com.example.bvt.component.Client;
import com.example.bvt.repository.RepositoryClient;
import com.example.bvt.service.ServiceClients;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceClient implements ServiceClients {
    private final RepositoryClient repositoryClient;
List<Client>list=new ArrayList<>();
    @Override
    public void save(Client client) {
        repositoryClient.save(client);
    }

    @Override
    public List<Client> getAll() {
        List<Client> clientList = new ArrayList<>();
        clientList.addAll(repositoryClient.findAll());
        return clientList;
    }

    @Override
    public Client getOne(Long id) {

        return repositoryClient.getOne(id);
    }

    @Override
    public void deleteForId(Long id) {
        repositoryClient.deleteById(id);

    }

    @Override
    public List<Client> getAllToToningID(Long id) {
        List<Client>clientList=repositoryClient.findAll();
        for (int i=0;i<=clientList.size()-1;i++){
            if(clientList.get(i).getIdToningAndBooking().hashCode()==id.hashCode()){
                list.add(clientList.get(i));

            }
        }
        return list;
    }

    @Override
    public Optional<Client> getClientByID(Long id) {
        return Optional.ofNullable(repositoryClient.getOne(id));
    }
}
