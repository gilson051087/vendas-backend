package com.telefonia.backend.repositories;

import com.telefonia.backend.entities.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, String> {
}
