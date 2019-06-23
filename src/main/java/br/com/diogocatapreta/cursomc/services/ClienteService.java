package br.com.diogocatapreta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diogocatapreta.cursomc.domain.Cliente;
import br.com.diogocatapreta.cursomc.repositories.ClienteRepository;
import br.com.diogocatapreta.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	public ClienteRepository clienteRepo;
	
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> cliente = clienteRepo.findById(id);
		
		return cliente.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		
	}
	
}
