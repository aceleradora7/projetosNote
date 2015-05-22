package com.company;

/**
 * Created by aluno04 on 20/05/15.
 */
public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(int codigo, String descricao, double preco, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo>0)
            this.codigo = codigo;

        else
            System.out.println("Código inválido, é aceito somente código positivo.");

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

    }

    public double promocao(int codigo){
        this.codigo = codigo;
        if (codigo>=4 || codigo<=5){
            preco= preco - (preco*0.1);
            return preco;
        }
        else if(codigo==3){
            preco= preco - (preco*0.07);
            return preco;
        }
        else if(codigo>=2 || codigo<=1){
            preco= preco - (preco*0.05);
            return preco;
        }
        else{
            return preco;
        }

    }

}
