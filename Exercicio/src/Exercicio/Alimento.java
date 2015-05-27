package Exercicio;

/**
 * Created by rafael on 5/26/15.
 */
public class Alimento {
    private String nome;
    private double sal;
    private double sodio;

    public Alimento(String nome, double sodio) {
        this.nome = nome;
        this.sodio = sodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getSodio() {
        return sodio;
    }

    public void setSodio(double sodio) {
        this.sodio = sodio;
    }

    public double calculo(double sodio){
        sal = sodio * 2.5;
        return sal;
    }
}


