package br.com.lucas.farmacia.model;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTests {
	@Test
	public void criar() {
		
		Cliente c = new Cliente(
				Short.valueOf("1"),
				"Maria",
				"maria@gmail.com",
				"111.111.111-11",
				LocalDate.of(2005, 07, 20)
				);
		System.out.println(c);
	}
}
