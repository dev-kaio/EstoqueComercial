package com.mycompany.estoquecomercial;

import com.mycompany.estoquecomercial.Classes.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueComercial {


    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        exibirMenu(estoque, sc);
    }

    public static void exibirMenu(ArrayList<Produto> estoque, Scanner sc) {
        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Movimentação");
            System.out.println("3 - Reajuste de Preços");
            System.out.println("4 - Relatórios");
            System.out.println("0 - Finalizar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> cadastrarProduto(estoque, sc);
                case 2 -> movimentacao(estoque, sc);
                case 3 -> reajustePrecos(estoque, sc);
                case 4 -> relatorios(estoque, sc);
                case 0 -> System.out.println("Sistema finalizado.");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void cadastrarProduto(ArrayList<Produto> estoque, Scanner sc) {
        System.out.println(">>> Cadastro de Produto");
    }

    public static void movimentacao(ArrayList<Produto> estoque, Scanner sc) {
        System.out.println(">>> Movimentação");
    }

    public static void reajustePrecos(ArrayList<Produto> estoque, Scanner sc) {
        System.out.println(">>> Reajuste de Preços");
    }

    public static void relatorios(ArrayList<Produto> estoque, Scanner sc) {
        System.out.println(">>> Relatórios");
    }
}