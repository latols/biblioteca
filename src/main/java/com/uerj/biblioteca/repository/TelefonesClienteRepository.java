package com.uerj.biblioteca.repository;

import com.uerj.biblioteca.model.TelefonesCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelefonesClienteRepository extends JpaRepository<TelefonesCliente, String> {

//    @Modifying
//    @Query("UPDATE telefonesCliente t SET t.numtelefone = :numtelefone WHERE t.cpf = :cpf")
//    int atualiza(@Param("cpf") String cpf, @Param("numtelefone") String numtelefone);

}