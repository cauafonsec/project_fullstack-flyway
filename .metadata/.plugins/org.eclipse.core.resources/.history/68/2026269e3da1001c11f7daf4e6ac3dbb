package com.example.algamoney.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.api.domain.Categoria;
import com.example.algamoney.api.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	
}
