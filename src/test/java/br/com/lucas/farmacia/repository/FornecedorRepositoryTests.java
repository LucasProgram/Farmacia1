package br.com.lucas.farmacia.repository;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.lucas.farmacia.model.Fornecedor;

@SpringBootTest
public class FornecedorRepositoryTests {
	
	@Autowired
	private FornecedorRepository fr;
	
	@Test
	public void inserir() {
		Fornecedor f1 = new Fornecedor(
				null,
				"CIMED",
				"999.999.999/9999-99",
				"(87)99900-0000",
				"Afogados-PE",
				LocalDate.of(2001, 05, 01)
				);
		Fornecedor f2 = new Fornecedor(
				null,
				"EUROFARMA", 
				"111.111.111/0102-01",  
				"(87)99902-0001", 
				"Tabira-PE", 
				LocalDate.of(2024, 8, 12)
				);
		
		fr.save(f1);
		fr.save(f2);
	}
}
