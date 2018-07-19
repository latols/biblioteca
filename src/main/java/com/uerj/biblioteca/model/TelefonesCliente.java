package com.uerj.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "telefonescliente")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
public class TelefonesCliente {

    @Id
    @Column(name = "numtelefone", nullable = false)
    private String numTelefone;

    @NotNull
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "cpf", insertable = false, updatable = false)
    private Cliente cliente;

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}