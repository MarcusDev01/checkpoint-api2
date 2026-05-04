package com.github.MarcusDev01.checkpoint.parte2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "oscars")
public class Oscar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String filme;

    private String categoria;

    private int ano;

    private String diretor;

    @Column(nullable = true)
    private String descricao;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFilme() { return filme; }
    public void setFilme(String filme) { this.filme = filme; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}