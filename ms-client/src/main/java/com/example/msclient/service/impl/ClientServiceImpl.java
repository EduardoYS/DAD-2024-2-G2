package com.example.msclient.service.impl;

import com.example.msclient.entity.Client;
import com.example.msclient.repository.ClientRepository;
import com.example.msclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> list() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Integer id, Client client) {
        client.setId(id);
        return clientRepository.save(client) ;
    }

    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
}
