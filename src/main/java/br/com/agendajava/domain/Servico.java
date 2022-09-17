package br.com.agendajava.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "servico")
@Data
public class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descricao", nullable = false, length = 60)
	private String descricao;
	
	@Column(name = "data_do_servico")
	private Date data_do_servico;
	
	@Column(name = "data_do_pagamento")
	private Date data_do_pagamento;
	
	@Column(name = "valor", precision = 7, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@Column(name = "forma_de_pagamento", nullable = false, length = 40)
	private String forma_de_pagamento;
	
	@Column(name = "observacao", length = 100)
	private String observacao;
}
