package br.com.macedo.agenda.testes;

import br.com.macedo.agenda.dao.ContatoDao;
import br.com.macedo.agenda.modelo.Contato;
import br.com.macedo.agenda.util.JPAUtil;

import javax.persistence.EntityManager;

public class CadastroContatoTeste {

    public static void main(String[] args) {

        Contato contato = new Contato("Francisco Macedo","97991506009","francisco@gmail.com");
        Contato contato1 = new Contato("Fabricio Macedo","97991000000","frabricio@gmail.com");
        Contato contato2 = new Contato("Sandra Macedo","9799188888","sandra@gmail.com");

        EntityManager entityManager = JPAUtil.getEntityManager();
        ContatoDao contatoDao = new ContatoDao(entityManager);

        entityManager.getTransaction().begin();

        contatoDao.salvarContato(contato);
        contatoDao.salvarContato(contato1);
        contatoDao.salvarContato(contato2);


        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
