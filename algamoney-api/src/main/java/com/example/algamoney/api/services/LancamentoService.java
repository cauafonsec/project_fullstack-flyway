package com.example.algamoney.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.domain.Lancamento;
import com.example.algamoney.api.repositories.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository repo;
	
	
	
	public List<Lancamento> findAll() {
		return repo.findAll();
	}

	public Lancamento insert(Lancamento obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Lancamento find(Integer id) {
		Optional<Lancamento> obj = repo.findById(id);
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

	public Lancamento update(Lancamento obj) {
		Lancamento newObj = find(obj.getId());
		return repo.save(newObj);
	}
		

}
