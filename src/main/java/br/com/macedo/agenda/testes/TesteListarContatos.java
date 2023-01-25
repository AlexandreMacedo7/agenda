package br.com.macedo.agenda.testes;

import br.com.macedo.agenda.dao.ContatoDao;
import br.com.macedo.agenda.modelo.Contato;
import br.com.macedo.agenda.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class TesteListarContatos {

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManager();
        ContatoDao contatoDao = new ContatoDao(entityManager);

        List<Contato> contatoLista = contatoDao.listarContatos();

        contatoLista.forEach(System.out::println);
    }
}
