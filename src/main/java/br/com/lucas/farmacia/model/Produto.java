package br.com.lucas.farmacia.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(name = "nome", length = 50, nullable = false, unique = true)
	private String nome;
	
	@Column(name = "qtd", nullable = false)
	private Short qtd;
	
	@Column(name = "preco", nullable = false, precision = 6, scale = 2)
	private BigDecimal preco;
	
	@Column(name = "DataValidade", nullable = false)
	private LocalDate dataValidade;
}
