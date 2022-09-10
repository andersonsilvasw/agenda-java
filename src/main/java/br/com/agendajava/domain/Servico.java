package br.com.agendajava.domain;

import java.util.Date;

public class Servico {
	
	private Long id;
	private String descricao;
	private Date data_do_servico;
	private Date data_do_pagamento;
	private Double valor;
	private String forma_de_pagamento;
	private String observacao;
	
	public Servico() {
	}

	public Servico(Long id, String descricao, Date data_do_servico, Date data_do_pagamento, Double valor,
			String forma_de_pagamento, String observacao) {
		this.id = id;
		this.descricao = descricao;
		this.data_do_servico = data_do_servico;
		this.data_do_pagamento = data_do_pagamento;
		this.valor = valor;
		this.forma_de_pagamento = forma_de_pagamento;
		this.observacao = observacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_do_servico() {
		return data_do_servico;
	}

	public void setData_do_servico(Date data_do_servico) {
		this.data_do_servico = data_do_servico;
	}

	public Date getData_do_pagamento() {
		return data_do_pagamento;
	}

	public void setData_do_pagamento(Date data_do_pagamento) {
		this.data_do_pagamento = data_do_pagamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getForma_de_pagamento() {
		return forma_de_pagamento;
	}

	public void setForma_de_pagamento(String forma_de_pagamento) {
		this.forma_de_pagamento = forma_de_pagamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + ", descricao=" + descricao + ", data_do_servico=" + data_do_servico
				+ ", data_do_pagamento=" + data_do_pagamento + ", valor=" + valor + ", forma_de_pagamento="
				+ forma_de_pagamento + ", observacao=" + observacao + "]";
	}
}
