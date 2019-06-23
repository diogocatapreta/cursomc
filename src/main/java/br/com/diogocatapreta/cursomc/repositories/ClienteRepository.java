package br.com.diogocatapreta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.diogocatapreta.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}
