package com.example.algamoney.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.domain.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Integer>{

}
