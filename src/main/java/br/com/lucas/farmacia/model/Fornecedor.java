package br.com.lucas.farmacia.model;

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
@Table(name = "fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(name = "nome", length = 50, nullable = false, unique = true)
	private String nome;
	
	@Column(name = "cnpj", length = 50, nullable = false, unique = true)
	private String cnpj;
	
	@Column(name = "telefone", length = 50, nullable = false, unique = true)
	private String telefone;
	
	@Column(name = "cidade", length = 50, nullable = false, unique = true)
	private String cidade;
	
	@Column(name = "DataFundacao", nullable = false)
	private LocalDate dataFundacao;
	
}
