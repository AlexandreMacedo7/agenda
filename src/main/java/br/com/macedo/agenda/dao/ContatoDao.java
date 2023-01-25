package br.com.macedo.agenda.dao;

import br.com.macedo.agenda.modelo.Contato;

import javax.persistence.EntityManager;
import java.util.List;

public class ContatoDao {

    private EntityManager entityManager;

    public ContatoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void salvarContato(Contato contato){
        this.entityManager.persist(contato);
    }

    public List<Contato> listarContatos(){
        String jpql = "SELECT c From Contato c";
        return  entityManager.createQuery(jpql, Contato.class).getResultList();
    }
    public void deletarPorNome(String nome){
        String jpql = "Delete Contato c Where c.nome = :parametro";
        entityManager.createQuery(jpql).setParameter("parametro", nome).executeUpdate();
    }
    public Contato buscaPorNome(String nome){
        String jpql = "Select c From Contato c Where c.nome = :parametro";
        return entityManager.createQuery(jpql,Contato.class).setParameter("parametro", nome).getSingleResult();
    }
}
