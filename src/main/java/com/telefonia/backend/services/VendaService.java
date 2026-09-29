package com.telefonia.backend.services;

import com.telefonia.backend.entities.Venda;
import com.telefonia.backend.repositories.VendaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    private final VendaRepository vendaRepository;

    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public Page<Venda> listarTodas(Pageable pageable) {
        return vendaRepository.findAll(pageable);
    }
}