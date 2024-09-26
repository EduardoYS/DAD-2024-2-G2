package org.example.msclientservice.repository;

import com.example.mscatalog.entity.Category;
import org.example.msclientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {
List<Client> findByName(String name);
}
