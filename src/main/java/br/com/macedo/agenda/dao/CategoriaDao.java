package br.com.macedo.agenda.dao;

import br.com.macedo.agenda.modelo.Categoria;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDao {

    private EntityManager entityManager;

    public CategoriaDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public void cadastrarCategoria(Categoria categoria){
        this.entityManager.persist(categoria);
    }
    public List<Categoria> listarCategorias(){
        String jpql = "Select c From Categoria c";
        return entityManager.createQuery(jpql,Categoria.class).getResultList();
    }
}
