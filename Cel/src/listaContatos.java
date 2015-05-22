import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by aluno06 on 21/05/15.
 */
public class listaContatos {
    private ArrayList<Contato> lista = new ArrayList<Contato>();

    public void addContato(Contato c){
        lista.add(c);
    }

    public void removeContato(int index){
        lista.remove(index);
    }

    public void imprime(){
        for (Contato dados: lista) {
            System.out.println(dados.getNome()+"|"+dados.getDataNascimento()+"|"+dados.getRg()+"|");

        }
    }

    @Override
    public int compareTo(Contato c) {
        Comparable.

    }


}
