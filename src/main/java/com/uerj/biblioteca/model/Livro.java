package com.uerj.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "telefonecliente")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
public class Livro {

    @Id
    @Column(name = "isbn", nullable = false)
    private String isbn;

    @NotNull
    private String titulo;

    @NotNull
    private int edicao;

    @NotNull
    private Date dataPublicacao;

    @NotNull
    private int quantidade;

    @NotNull
    private String cnpjEditora;


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCnpjEditora() {
        return cnpjEditora;
    }

    public void setCnpjEditora(String cnpjEditora) {
        this.cnpjEditora = cnpjEditora;
    }
}