package com.uerj.biblioteca.repository;

import com.uerj.biblioteca.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

    @Query(value = "SELECT * FROM cliente " ,nativeQuery = true)
    List<Cliente> selectTodosOsClientes();

    @Query(value = "SELECT * FROM cliente " + "where cpf = ?" ,nativeQuery = true)
    Cliente selectClientePorCpf(String cpf);

    //Melhora utilizando query nativa
    /*@Query(value = "insert into cliente (cpf, nome, email, endereco) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    void createCadastroCliente(String cpf, String nome, String email, String endereco);*/

    //Melhoria utilizando query nativa
    /*@Modifying
    @Query(value = "DELETE FROM cliente where cpf = ?" ,nativeQuery = true)
    void deleteCliente(String cpf);*/
}