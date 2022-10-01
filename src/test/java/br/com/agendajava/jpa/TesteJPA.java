package br.com.agendajava.jpa;

import br.com.agendajava.dao.DAO;
import br.com.agendajava.domain.Servico;

public class TesteJPA {

	public static void main(String[] args) {
		DAO<Servico> daoServico = new DAO<>(Servico.class);
	}
}
