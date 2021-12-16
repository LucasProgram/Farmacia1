package br.com.lucas.farmacia.model;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FornecedorTests{
		@Test
		public void criar() {
			
			Fornecedor f = new Fornecedor(
					Short.valueOf("1"),
					"CIMED",
					"999.999.999/9999-99",
					"(87)99900-0000",
					"Afogados-PE",
					LocalDate.of(2001, 05, 01)
					);
			System.out.println(f);
		}
}
