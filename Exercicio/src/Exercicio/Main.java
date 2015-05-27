package Exercicio;

public class Main {

    public static void main(String[] args) {
	    Alimento al1 = new Alimento("trakinas",5);
        Alimento al2 = new Alimento("pao dagua",3);
        Alimento al3 = new Alimento("coca cola",10);
        Exerc e = new Exerc();

        e.addAlimento(al1);
        e.addAlimento(al2);
        e.addAlimento(al3);

        System.out.println(e.verLista());




    }
}
