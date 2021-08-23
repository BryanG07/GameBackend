package com.example.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.games.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
