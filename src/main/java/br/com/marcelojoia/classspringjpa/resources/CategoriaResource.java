package br.com.marcelojoia.classspringjpa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelojoia.classspringjpa.domain.Categoria;
import br.com.marcelojoia.classspringjpa.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	public CategoriaService service;

	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findAll(@PathVariable Integer id) {
		Categoria obj = service.findAll(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
