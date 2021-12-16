package br.com.lucas.farmacia.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.lucas.farmacia.model.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	
	@Autowired
	private ProdutoRepository pr;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(
				null,
				"Doril", 
				Short.valueOf("100"), 
				BigDecimal.valueOf(6.50),
				LocalDate.of(2022, 11, 19)
				);
		Produto p2 = new Produto(
				null,
				"Dipirona", 
				Short.valueOf("200"), 
				BigDecimal.valueOf(2.50),
				LocalDate.of(2024, 8, 12)
				);
		
		pr.save(p1);
		pr.save(p2);
	}
}
