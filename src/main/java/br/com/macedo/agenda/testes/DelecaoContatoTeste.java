package br.com.macedo.agenda.testes;

import br.com.macedo.agenda.dao.ContatoDao;
import br.com.macedo.agenda.util.JPAUtil;

import javax.persistence.EntityManager;

public class DelecaoContatoTeste {

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManager();
        ContatoDao contatoDao = new ContatoDao(entityManager);

        entityManager.getTransaction().begin();

        contatoDao.deletar("Alexandre Macedo");

        entityManager.getTransaction().commit();
        entityManager.close();

    }

}
