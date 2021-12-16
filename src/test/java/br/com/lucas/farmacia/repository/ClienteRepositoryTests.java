package br.com.lucas.farmacia.repository;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.lucas.farmacia.model.Cliente;

@SpringBootTest
public class ClienteRepositoryTests {
	
	@Autowired
	private ClienteRepository cr;
	
	@Test
	public void inserir() {
		Cliente c1 = new Cliente(
				null,
				"Maria", 
				"maria@gmail.com", 
				"111.111.111-11",
				LocalDate.of(2005, 07, 20)
				);
		Cliente c2 = new Cliente(
				null,
				"João", 
				"joao@gmail.com", 
				"222.222.222-22",
				LocalDate.of(2000, 8, 12)
				);
		
		cr.save(c1);
		cr.save(c2);
	}
}
