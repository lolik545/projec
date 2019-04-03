package com.example.bvt.service;

import com.example.bvt.component.Client;

import java.util.List;

public interface ServiceClients {

        public void save(Client client);

        public List<Client> getAll();

        public Client getOne(Long id);

        public void deleteForId(Long id);
    }
