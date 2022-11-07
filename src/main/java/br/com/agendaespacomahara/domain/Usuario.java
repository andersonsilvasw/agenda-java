package br.com.agendaespacomahara.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "usuario")
@Data
@EqualsAndHashCode(callSuper = false)
public class Usuario extends AbstractEntity {

	private static final long serialVersionUID = -4575202674401302951L;

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;
	
	@Column(name = "perfil", nullable = false, length = 15)
	private String perfil;

	@Column(name = "login", nullable = false, length = 15)
	private String login;

	@Column(name = "password", nullable = false, length = 8)
	private String password;
	
	public Usuario() {	
	}

	public Usuario(String nome, String perfil, String login, String password) {
		this.nome = nome;
		this.perfil = perfil;
		this.login = login;
		this.password = password;
	} 	
}
