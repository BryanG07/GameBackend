package com.example.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.games.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
