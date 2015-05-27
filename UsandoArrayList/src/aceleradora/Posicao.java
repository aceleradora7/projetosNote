package aceleradora;

import java.util.ArrayList;

/**
 * Created by rafael on 5/26/15.
 */
public class Posicao {

    public Posicao(){
    }

    public ArrayList<Integer> trocaValor (ArrayList<Integer> lista) {
        int maior = 0;
        int menor = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maior) {
                maior = lista.get(i);
                posicaoMaior = i;
            } else {
                menor = lista.get(i);
                posicaoMenor = i;
            }
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("PosMaior: "+posicaoMaior);
        System.out.println("PosMenor: "+posicaoMenor);
        lista.set(posicaoMaior, menor);
        lista.set(posicaoMenor, maior);
        return lista;
    }
}
