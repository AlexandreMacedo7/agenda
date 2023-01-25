package br.com.macedo.agenda.testes;

import br.com.macedo.agenda.dao.ContatoDao;
import br.com.macedo.agenda.modelo.Contato;
import br.com.macedo.agenda.util.JPAUtil;

import javax.persistence.EntityManager;

public class CadastroContatoTeste {

    public static void main(String[] args) {

        Contato contato = new Contato("Alexandre Macedo","97981231618","alexandre@gmail.com");

        EntityManager entityManager = JPAUtil.getEntityManager();
        ContatoDao contatoDao = new ContatoDao(entityManager);

        entityManager.getTransaction().begin();
        contatoDao.cadastrar(contato);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
