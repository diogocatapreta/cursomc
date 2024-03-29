package br.com.diogocatapreta.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.diogocatapreta.cursomc.domain.Cliente;
import br.com.diogocatapreta.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/api/v1/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;

	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscaCliente(@PathVariable Integer id) {
		
		Cliente cliente = service.buscar(id);
		return ResponseEntity.ok(cliente);
		
	}
}
