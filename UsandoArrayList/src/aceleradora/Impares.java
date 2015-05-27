package aceleradora;

import java.util.ArrayList;

/**
 * Created by rafael on 5/26/15.
 * Escreva um método que coloca todos os elementos
 * ímpares do arraylist na parte esquerda e todos os
 * elementos pares do vetor na parte direita.
 */
public class Impares {

    public Impares(){
    }

    public ArrayList<Integer> separarParesImpares(ArrayList<Integer> lista){
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) % 2 == 0) {
                pares.add(lista.get(i));
            }
            else
                impares.add(lista.get(i));
            }

        for (int i = 0; i < impares.size(); i++) {
            result.add(impares.get(i));
        }
        for (int i = 0; i < pares.size(); i++) {
            result.add(pares.get(i));
        }
            return result;
    }
}

