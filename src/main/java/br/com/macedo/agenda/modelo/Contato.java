package br.com.macedo.agenda.modelo;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String numero;
    private String email;

    public Contato() {
    }
    public Contato(String nome, String numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }
    @Transactional
    public void editarContatoNome(String nome){
        this.nome = nome;
    }
    @Transactional
    public void editarContatoNumero(String numero){
        this.nome = numero;
    }
    @Transactional
    public void editarContatoEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Id: %d - %s - contato: %s - email: %s", id, nome, numero, email);
    }
}
