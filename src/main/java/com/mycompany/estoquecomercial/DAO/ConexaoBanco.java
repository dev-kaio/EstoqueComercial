package com.mycompany.estoquecomercial.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {
    private static final String db = "jdbc:sqlite:estoque.db";

    public static Connection connection() {
        try {
            Connection con = DriverManager.getConnection(db);
            System.out.println("Conexão estabelecida com o banco de dados.");
            return con;
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
            return null;
        }
    }

    public static void criarTabelas(Connection con) {
        String sqlCategoria = """
                    CREATE TABLE IF NOT EXISTS categoria (
                        id        INTEGER PRIMARY KEY AUTOINCREMENT,
                        nome      TEXT NOT NULL,
                        tamanho   TEXT,
                        embalagem TEXT
                    );
                """;

        String sqlProduto = """
                    CREATE TABLE IF NOT EXISTS produto (
                        id        INTEGER PRIMARY KEY AUTOINCREMENT,
                        nomep     TEXT NOT NULL,
                        preco     REAL,
                        unidade   TEXT,
                        quantidade INTEGER,
                        qtdeMin   INTEGER,
                        qtdeMax   INTEGER,
                        categoria TEXT
                    );
                """;

        String sqlMovimentacao = """
                    CREATE TABLE IF NOT EXISTS movimentacao (
                        id               INTEGER PRIMARY KEY AUTOINCREMENT,
                        nomep            TEXT,
                        dataMovimentacao TEXT,
                        qtdeMovimentada  INTEGER,
                        tipoMovimentacao TEXT
                    );
                """;

        try (Statement stmt = con.createStatement()) {
            stmt.execute(sqlCategoria);
            stmt.execute(sqlProduto);
            stmt.execute(sqlMovimentacao);
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabelas: " + e.getMessage());
        }
    }
}