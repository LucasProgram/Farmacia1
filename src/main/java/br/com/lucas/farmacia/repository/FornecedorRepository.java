package br.com.lucas.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.farmacia.model.Fornecedor;
/*public interface FornecedorRepository {

}*/

public interface FornecedorRepository extends JpaRepository<Fornecedor, Short>{

}
