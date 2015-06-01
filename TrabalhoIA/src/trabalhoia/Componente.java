/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoia;

import org.omg.CORBA.NO_MEMORY;

/**
 *
 * @author 13204124
 */
public class Componente {
    private String nome;
    private int posX;
    private int posY;
    private boolean carregado;
    private int p;


    public Componente(String nome, int posX, int posY, boolean carregado) {
        this.nome = nome;
        this.posX = posX;
        this.posY = posY;
        this.carregado = carregado;
        p = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosX() {

        return posX;
    }

    public void setPosX(int posX) {

        this.posX = posX;
    }

    public int getPosY() {

        return posY;
    }

    public void setPosY(int posY) {

        this.posY = posY;
    }

    public boolean isCarregado(boolean c) {
        carregado = c;
        return carregado;
    }

    public boolean isCarregado() {
        return carregado;
    }

    public void setCarregado(boolean carregado) {

        this.carregado = carregado;
    }

    public String toString(){
        return nome;
    }
    public Object dadosComponente(){
        Object[] o = {nome,posX,posY};
        return o;
    };
}



