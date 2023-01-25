package br.com.macedo.agenda.testes;

import br.com.macedo.agenda.dao.ContatoDao;
import br.com.macedo.agenda.modelo.Contato;
import br.com.macedo.agenda.util.JPAUtil;

import javax.persistence.EntityManager;

public class AtualizacaoDeContatoTeste {

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManager();
        ContatoDao contatoDao = new ContatoDao(entityManager);

        Contato contato = contatoDao.buscaPorNome("Cristiano Macedo");

        contato.editarContatoEmail("fabricio@gmail.com");

        entityManager.getTransaction().begin();

        contatoDao.salvarContato(contato);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
