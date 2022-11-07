package br.com.agendaespacomahara.jpa;

import br.com.agendaespacomahara.dao.DAO;
import br.com.agendaespacomahara.domain.Servico;

public class TesteJPA {

	public static void main(String[] args) {
		DAO<Servico> daoServico = new DAO<>(Servico.class);
	}
}
