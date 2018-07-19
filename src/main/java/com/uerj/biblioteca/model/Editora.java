package com.uerj.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "editora")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
public class Editora{

    @Id
    @Column(name = "cnpjEditora", nullable = false)
    private String cnpjEditora;

    @NotNull
    private String nomeEditora;

    @NotNull
    private String enderecoEditora;


    public String getCnpjEditora() {
        return cnpjEditora;
    }

    public void setCnpjEditora(String cnpjEditora) {
        this.cnpjEditora = cnpjEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getEnderecoEditora() {
        return enderecoEditora;
    }

    public void setEnderecoEditora(String enderecoEditora) {
        this.enderecoEditora = enderecoEditora;
    }
}