package br.com.macedo.agenda.modelo;

import javax.persistence.*;

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

    @Override
    public String toString() {
        return String.format("Id: %d - %s - contato: %s - email: %s", id, nome, numero, email);
    }
}
