import java.util.ArrayList;

/**
 * Created by aluno06 on 21/05/15.
 */
public class Contato extends Pessoa implements Comparable<Contato>{
    private int idade;
    private String email;


    public Contato(String nome, String dataNascimento, String rg, int idade, String email){
        super(nome, dataNascimento, rg);
        this.idade = idade;
        this.email = email;
    }


}
