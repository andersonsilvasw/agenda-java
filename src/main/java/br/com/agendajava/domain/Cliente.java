package br.com.agendajava.domain;

import java.util.Date;

public class Cliente {
	
	private long id;
	private String nome;
	private String celular;
	private String whatsapp;
	private String observacao;
	private Date dataNascimento;
	
	public Cliente() {
	}

	public Cliente(long id, String nome, String celular, String whatsapp, String observacao, Date dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.celular = celular;
		this.whatsapp = whatsapp;
		this.observacao = observacao;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", celular=" + celular + ", whatsapp=" + whatsapp
				+ ", observacao=" + observacao + ", dataNascimento=" + dataNascimento + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}


