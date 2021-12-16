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

import br.com.lucas.farmacia.repository.ClienteRepository;
import br.com.lucas.farmacia.model.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository cr;

	@GetMapping
	public List<Cliente> listar() {
		List<Cliente> clientes = cr.findAll();
		return clientes;
	}
	
	@PostMapping
	public Cliente inserir(@RequestBody Cliente cliente) {
		Cliente clienteSalvo = cr.save(cliente);
		return clienteSalvo;
	}
	
	@DeleteMapping("/{codigo}")
	public Optional<Cliente> remover(@PathVariable Short codigo) {
		Optional<Cliente> cliente = cr.findById(codigo);
		cr.delete(cliente.get());
		return cliente;
	}
	
	@PutMapping
	public Cliente editar(@RequestBody Cliente cliente) {
		Cliente clienteEditado = cr.save(cliente);
		return clienteEditado;
	}
}
