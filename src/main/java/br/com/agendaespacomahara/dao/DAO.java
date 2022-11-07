package br.com.agendaespacomahara.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<E> {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> entidade;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("agenda_espaco_mahara");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public DAO(Class<E> entidade) {
		this.entidade = entidade;
		em = emf.createEntityManager();
	}

}
