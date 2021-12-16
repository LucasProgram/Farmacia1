package br.com.lucas.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.farmacia.model.Produto;
/*public interface ProdutoRepository {

}*/

public interface ProdutoRepository extends JpaRepository<Produto, Short>{

}
