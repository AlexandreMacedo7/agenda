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

    @ManyToOne
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Contato() {
    }
    public Contato(String nome, String numero, String email, Categoria categoria) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.categoria = categoria;
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
        return String.format("Id: %d - %s - contato: %s - email: %s - " +
                "Categoria: %s", id, nome, numero, email,categoria);
    }
}
