package br.com.macedo.agenda.dao;

import br.com.macedo.agenda.modelo.Contato;

import javax.persistence.EntityManager;

public class ContatoDao {

    private EntityManager entityManager;

    public ContatoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Contato contato){
        this.entityManager.persist(contato);
    }
}
