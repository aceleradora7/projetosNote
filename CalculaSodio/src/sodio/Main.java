package sodio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        Alimento al1 = new Alimento("trakinas", 5);
        Alimento al2 = new Alimento("coca cola", 10);
        Alimento al3 = new Alimento("pao", 3);

        listaAlimentos.add(al1);
        listaAlimentos.add(al2);
        listaAlimentos.add(al3);

        for (int i = 0; i < listaAlimentos.size(); i++) {
            System.out.println(listaAlimentos.get(i).getNome() + " - " + listaAlimentos.get(i).getSodio());
        }

        al1.setSodio(al1.getSodio()*2.5);
        al2.setSodio(al2.getSodio()*2.5);
        al3.setSodio(al3.getSodio()*2.5);

        for (int i = 0; i < listaAlimentos.size(); i++) {
            System.out.println(listaAlimentos.get(i).getNome() + " - " + listaAlimentos.get(i).getSodio());
        }

    }
}


