package sodio;

/**
 * Created by rafael on 5/26/15.
 */
public class Alimento {
    private String nome;
    private double sodio;
    private double sal;

    public Alimento(String nome, double sodio) {
        this.nome = nome;
        this.sodio = sodio;
        sal = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSodio() {
        return sodio;
    }

    public void setSodio(double sodio) {
        this.sodio = sodio;
    }


}
