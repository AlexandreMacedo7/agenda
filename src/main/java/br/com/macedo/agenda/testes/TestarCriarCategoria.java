package br.com.macedo.agenda.testes;

import br.com.macedo.agenda.dao.CategoriaDao;
import br.com.macedo.agenda.modelo.Categoria;
import br.com.macedo.agenda.util.JPAUtil;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestarCriarCategoria {

    public static void main(String[] args) {

    EntityManager entityManager = JPAUtil.getEntityManager();

        Categoria categoria = new Categoria("Amigos");
        Categoria categoria1 = new Categoria("Familia");
        Categoria categoria2 = new Categoria("Escola");
        Categoria categoria3 = new Categoria("Trabalho");

        CategoriaDao categoriaDao = new CategoriaDao(entityManager);

        entityManager.getTransaction().begin();

        categoriaDao.cadastrarCategoria(categoria);
        categoriaDao.cadastrarCategoria(categoria1);
        categoriaDao.cadastrarCategoria(categoria2);
        categoriaDao.cadastrarCategoria(categoria3);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
