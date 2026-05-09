package com.mycompany.estoquecomercial;

import com.mycompany.estoquecomercial.DAO.ConexaoBanco;

import java.sql.Connection;

public class EstoqueComercial {

    public static void main(String[] args) {
        Connection conn = ConexaoBanco.connection();

        if (conn != null) {
            try {
                ConexaoBanco.criarTabelas(conn);
            } catch (Exception e) {
                System.out.println("Erro ao criar tabelas: " + e.getMessage());
            }
        } else {
            System.out.println("Não foi possível estabelecer a conexão com o banco.");
        }
    }
}