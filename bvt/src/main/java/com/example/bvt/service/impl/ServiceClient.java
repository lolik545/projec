package com.example.bvt.service.impl;

import com.example.bvt.component.Client;
import com.example.bvt.repository.RepositoryClient;
import com.example.bvt.service.ServiceClients;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceClient implements ServiceClients {
    private final RepositoryClient repositoryClient;
    @Override
    public void save(Client client) {
        repositoryClient.save(client);
    }

    @Override
    public List<Client> getAll() {
        List<Client> clientList=new ArrayList<>();
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
    }
