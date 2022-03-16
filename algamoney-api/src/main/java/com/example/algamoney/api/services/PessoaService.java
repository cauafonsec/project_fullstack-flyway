package com.example.algamoney.api.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.domain.Pessoa;
import com.example.algamoney.api.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	
	
	public List<Pessoa> findAll() {
		return repo.findAll();
	}

	public @Valid Pessoa insert(@Valid Pessoa obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Optional<Pessoa> find(Integer id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj;
	}

}
