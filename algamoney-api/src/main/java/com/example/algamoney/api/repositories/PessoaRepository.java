package com.example.algamoney.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
