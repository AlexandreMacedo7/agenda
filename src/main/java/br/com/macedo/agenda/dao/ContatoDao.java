package br.com.macedo.agenda.dao;

import br.com.macedo.agenda.modelo.Contato;

import javax.persistence.EntityManager;
import java.util.List;

public class ContatoDao {

    private EntityManager entityManager;

    public ContatoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Contato contato){
        this.entityManager.persist(contato);
    }

    public List<Contato> listarContatos(){
        String jpql = "SELECT c From Contato c";
        return  entityManager.createQuery(jpql, Contato.class).getResultList();
    }
    public void deletar(String nome){
        String jpql = "Delete Contato c Where c.nome = :parametro";
        entityManager.createQuery(jpql).setParameter("parametro", nome).executeUpdate();
    }
}
