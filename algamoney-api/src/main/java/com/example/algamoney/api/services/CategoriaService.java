package com.example.algamoney.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.domain.Categoria;
import com.example.algamoney.api.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	
	public List<Categoria> findAll() {
		return repo.findAll();
	}

}
