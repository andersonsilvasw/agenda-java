package br.com.agendajava.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome", nullable = false, length = 60)
	private String nome;
	
	@Column(name = "celular", nullable = false, length = 20)
	private String celular;
	
	@Column(name = "whatsapp", length = 20)
	private String whatsapp;
	
	@Column(name = "observacao", length = 80)
	private String observacao;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;
	
}


