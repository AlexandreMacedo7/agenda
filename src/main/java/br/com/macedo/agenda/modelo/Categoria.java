package br.com.macedo.agenda.modelo;

import javax.persistence.*;

@Entity()
@Table(name="categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Categoria() {
    }
    public Categoria(String name) {
        this.name = name;
    }
}
