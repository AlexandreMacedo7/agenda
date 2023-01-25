package br.com.macedo.agenda.testes;

import br.com.macedo.agenda.dao.CategoriaDao;
import br.com.macedo.agenda.dao.ContatoDao;
import br.com.macedo.agenda.modelo.Categoria;
import br.com.macedo.agenda.modelo.Contato;
import br.com.macedo.agenda.util.JPAUtil;

import javax.persistence.EntityManager;

public class CadastroContatoTeste {

    public static void main(String[] args) {

        Categoria categoria = new Categoria("Amigos");

        Contato contato = new Contato("Alexandre Macedo", "9798123118",
                "alexandre@gmail.com",categoria);

        EntityManager entityManager = JPAUtil.getEntityManager();
        ContatoDao contatoDao = new ContatoDao(entityManager);
        CategoriaDao categoriaDao = new CategoriaDao(entityManager);

        entityManager.getTransaction().begin();

        categoriaDao.cadastrarCategoria(categoria);
        contatoDao.salvarContato(contato);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
