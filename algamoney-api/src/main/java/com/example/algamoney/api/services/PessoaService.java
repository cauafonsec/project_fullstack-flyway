package com.example.algamoney.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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

	public Pessoa insert(Pessoa obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Pessoa find(Integer id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj.orElseThrow();
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("Não foi possivel deletar essa pessoa");
		}
	}

	public Pessoa update(Pessoa obj) {
		Pessoa newObj = find(obj.getId());
		return repo.save(newObj);
	}
		

}
