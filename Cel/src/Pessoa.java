/**
 * Created by aluno06 on 21/05/15.
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String rg;

    public Pessoa(String nome, String dataNascimento, String rg) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getRg() {
        return rg;
    }
}


