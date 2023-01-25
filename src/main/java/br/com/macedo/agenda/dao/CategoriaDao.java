package br.com.macedo.agenda.dao;

import br.com.macedo.agenda.modelo.Categoria;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class CategoriaDao {

    private EntityManager entityManager;

    public CategoriaDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public void cadastrarCategoria(Categoria categoria){
        entityManager.persist(categoria);
    }
}
