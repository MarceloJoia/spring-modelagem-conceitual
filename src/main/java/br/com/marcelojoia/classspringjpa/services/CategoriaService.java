package br.com.marcelojoia.classspringjpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.marcelojoia.classspringjpa.domain.Categoria;
import br.com.marcelojoia.classspringjpa.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	public CategoriaRepository repository;

	@GetMapping
	public Categoria findAll(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
