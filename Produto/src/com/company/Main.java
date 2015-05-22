package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaProdutos lista = new ListaProdutos();

        Scanner s1 = new Scanner(System.in);
        String descricao = null;
        double preco = 0;
        int codigo = 0;

        String fim = null;

        int f = 1;
        while (f == 1) {
        System.out.println("Deseja inserir itens? ");
        fim = s1.next();

            if (fim.equals("n")) {
                System.out.println("Aplicação Encerrada");
                f = 0;
                System.exit(0);

            }
            System.out.println("Informe a descrição do produto: ");
            descricao = s1.next();

            System.out.println("Informe o preço do produto: ");
            preco = s1.nextDouble();

            System.out.println("Informe o quantidade do produto: ");

            int quantidade = 0;
            quantidade = s1.nextInt();
            while (quantidade < 2 || quantidade > 30) {
                System.out.println("Quantidade inválida, é aceito somente quantidades entre 2-30. Digite novamente a quantidade: ");
                quantidade = s1.nextInt();
            }

            System.out.println("Informe o codigo do produto: ");
            codigo = s1.nextInt();
            Produto p1 = new Produto(codigo, descricao, preco, quantidade);
            lista.addItem(p1);
            System.out.println(p1.getCodigo() + "\n" + p1.getQuantidade() + "\n" + p1.getPreco() + "\n" + p1.getDescricao());
        }
    }
}




