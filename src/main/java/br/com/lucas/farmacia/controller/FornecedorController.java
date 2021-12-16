package br.com.lucas.farmacia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucas.farmacia.repository.FornecedorRepository;
import br.com.lucas.farmacia.model.Fornecedor;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
	
	@Autowired
	private FornecedorRepository fr;

	@GetMapping
	public List<Fornecedor> listar() {
		List<Fornecedor> fornecedores = fr.findAll();
		return fornecedores;
	}
	
	@PostMapping
	public Fornecedor inserir(@RequestBody Fornecedor fornecedor) {
		Fornecedor fornecedorSalvo = fr.save(fornecedor);
		return fornecedorSalvo;
	}
	
	@DeleteMapping("/{codigo}")
	public Optional<Fornecedor> remover(@PathVariable Short codigo) {
		Optional<Fornecedor> fornecedor = fr.findById(codigo);
		fr.delete(fornecedor.get());
		return fornecedor;
	}
	
	@PutMapping
	public Fornecedor editar(@RequestBody Fornecedor fornecedor) {
		Fornecedor fornecedorEditado = fr.save(fornecedor);
		return fornecedorEditado;
	}

}
