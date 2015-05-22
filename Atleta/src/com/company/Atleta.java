package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by rafael on 5/20/15.
 */
public class Atleta implements Comparable<Atleta> {
    private String nome;
    private double nota;
    private ArrayList<Atleta> listaAtletas;

    public Atleta(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        listaAtletas = new ArrayList<Atleta>();
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int compareTo(Atleta outroAtleta){
        if (this.nota < outroAtleta.nota){
            return -1;
        }
        if (this.nota > outroAtleta.nota) {
            return 1;
        }
        return 0;
    }

    public void addAtleta(Atleta atleta){
        listaAtletas.add(atleta);
    }

    public void ordenaLista(ArrayList<Atleta> lista){
        Collections.sort(lista);
    }

    public ArrayList<Atleta> calculaMedia(ArrayList<Atleta> lista){
        ArrayList<Atleta> retorno = new ArrayList<Atleta>();
        ordenaLista(lista);
        lista.

        return retorno;
    }

}


