package br.com.macedo.agenda.testes;

import br.com.macedo.agenda.dao.CategoriaDao;
import br.com.macedo.agenda.modelo.Categoria;
import br.com.macedo.agenda.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class ListarCategoriasTeste {

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManager();
        CategoriaDao categoriaDao = new CategoriaDao(entityManager);

        List<Categoria> listaCategorias = categoriaDao.listarCategorias();

        listaCategorias.forEach(System.out::println);

    }
}
