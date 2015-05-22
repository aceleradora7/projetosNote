package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aluno04 on 20/05/15.
 */
public class ListaProdutos {


    ArrayList<Produto> ListaProdutos = new ArrayList<Produto>();
    public void addItem(Produto p){
        ListaProdutos.add(p);

    }

    public void ListaItens(){
        for (int i = 0; i < ListaProdutos.size() ; i++) {
            System.out.println("Código: "+ ListaProdutos.toString());
        }
    }

}
