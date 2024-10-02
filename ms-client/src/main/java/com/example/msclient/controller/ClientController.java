package com.example.msclient.controller;

import com.example.msclient.entity.Client;
import com.example.msclient.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;


    @GetMapping
    public ResponseEntity<List<Client>> List() {
        return ResponseEntity.ok(clientService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> getById(@PathVariable (required = true)Integer id) {
        return ResponseEntity.ok(clientService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Client> save(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.save(client));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable (required = true)Integer id, @RequestBody Client client) {
        return ResponseEntity.ok(clientService.update(id, client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Client>> delete(@PathVariable (required = true)Integer id) {
        clientService.delete(id);
        return  ResponseEntity.ok(clientService.list());
    }
}
