package br.com.diogocatapreta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diogocatapreta.cursomc.domain.Categoria;
import br.com.diogocatapreta.cursomc.repositories.CategoriaRepository;
import br.com.diogocatapreta.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	public CategoriaRepository categoriaRepo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = categoriaRepo.findById(id);
		
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}
	
}
