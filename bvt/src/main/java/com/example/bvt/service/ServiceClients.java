package com.example.bvt.service;

import com.example.bvt.component.Client;

import java.util.List;
import java.util.Optional;

public interface ServiceClients {

     void save(Client client);

     List<Client> getAll();

     Client getOne(Long id);

     void deleteForId(Long id);

}
