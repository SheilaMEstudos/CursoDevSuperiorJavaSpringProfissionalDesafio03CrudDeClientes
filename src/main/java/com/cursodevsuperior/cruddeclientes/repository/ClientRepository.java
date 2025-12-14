package com.cursodevsuperior.cruddeclientes.repository;

import com.cursodevsuperior.cruddeclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}