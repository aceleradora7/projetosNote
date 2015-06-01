package aceleradora;

import java.util.Comparator;

/**
 * Created by rafael on 5/27/15.
 */
public class Funcionario {
    private String nome;
    private int inscricao;

    public Funcionario(String nome, int inscricao) {
        this.nome = nome;
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getInscricao() {
        return inscricao;
    }

    public static Comparator<Funcionario> OrdenaNome = new Comparator<Funcionario>() { //comparar por nome
        @Override
        public int compare(Funcionario f1, Funcionario f2) {
            String nomeFuncionario1 = f1.getNome().toUpperCase();
            String nomeFuncionario2 = f2.getNome().toUpperCase();
            return nomeFuncionario1.compareTo(nomeFuncionario2);
        }
    };

    public static Comparator<Funcionario> OrdenaInscricao = new Comparator<Funcionario>() { //comparar por Inscricao
        @Override
        public int compare(Funcionario f1, Funcionario f2) {
            int InscFuncionario1 = f1.getInscricao();
            int InscFuncionario2 = f2.getInscricao();
            return InscFuncionario1 - InscFuncionario2; //ordem inversa: InscFuncionario2-InscFuncionario1
        }
    };


    //    @Override
//    public int compareTo(Funcionario f) {
//        int compareInscricao = ((Funcionario)f).getInscricao();
//        return this.inscricao-compareInscricao;
//    }
//
    public String toString() {
        return "Nome: " + getNome() + " - Inscriçao: " + getInscricao();
    }
}

