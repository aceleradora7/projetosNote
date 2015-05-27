package Exercicio;

import java.util.ArrayList;

/**
 * Created by rafael on 5/26/15.
 */
public class Exerc {
    ArrayList<Alimento> Listaalimentos;

    public Exerc(){
        Listaalimentos = new ArrayList<Alimento>();
    }

    public void addAlimento(Alimento a){
        Listaalimentos.add(a);
    }

    public ArrayList<Alimento> verLista(){

        for (int i = 0; i < Listaalimentos.size(); i++) {
            System.out.println(Listaalimentos.get(i).getNome());
            System.out.println(Listaalimentos.get(i).getSodio());
            System.out.println(Listaalimentos.get(i).getSal());
        }

        return Listaalimentos;
    }
}
