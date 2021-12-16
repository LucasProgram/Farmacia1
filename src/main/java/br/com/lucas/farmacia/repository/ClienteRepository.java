package br.com.lucas.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.farmacia.model.Cliente;
/*public interface ClienteRepository {

}*/

public interface ClienteRepository extends JpaRepository<Cliente, Short>{

}
