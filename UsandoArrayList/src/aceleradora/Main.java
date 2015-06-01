package aceleradora;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static ArrayList<String> amigos = new ArrayList<>();
    private static ArrayList<Integer> numeros = new ArrayList<>();
    private static ArrayList<Integer> numeros1 = new ArrayList<>();
    private static ArrayList<Integer> numeros2 = new ArrayList<>();
    private static ArrayList<Boolean> result = new ArrayList<>();
    private static ArrayList<String> listaM = new ArrayList<>();
    private static ArrayList<String> listaN = new ArrayList<>();
    private static ArrayList<Funcionario> funcionario = new ArrayList<>();



    public static void populaLista(){
        Funcionario f1 = new Funcionario("Marcus", 23);
        Funcionario f2 = new Funcionario("Antonio", 36);
        Funcionario f3 = new Funcionario("João", 75);
        Funcionario f4 = new Funcionario("Rafael", 54);

        funcionario.add(f1);
        funcionario.add(f2);
        funcionario.add(f3);
        funcionario.add(f4);

        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);

        numeros1.add(0,1);
        numeros1.add(1,5);
        numeros1.add(2,4);

        numeros2.add(0,2);
        numeros2.add(1,4);
        numeros2.add(2,6);

        listaM.add(0,"teste1");
        listaM.add(1,"teste2");
        listaM.add(2,"teste3");
        listaM.add(3,"teste5");

        listaN.add(0,"teste4");
        listaN.add(1,"teste2");
        listaN.add(2,"teste6");

    }
    public static ArrayList<Boolean> listaBooleanos(ArrayList<Integer> A, ArrayList<Integer> B) {
        A = numeros1;
        B = numeros2;

        for (int i = 0; i < A.size(); i++) {
                if (A.get(i)==B.get(i)) {
                    result.add(i, true);
                    System.out.println(A.get(i) + "=" + B.get(i)+result.get(i));
                }
                else {
                    result.add(i, false);
                    System.out.println(A.get(i) + "=" + B.get(i));
                    System.out.println(A.get(i) + "=" + B.get(i)+result.get(i));
                }

        }
        return result;
    }


    public static int somaLista(){
        int result = 0;
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        for (int i = 0; i < numeros.size(); i++) {
            result = result + numeros.get(i);
        }
        //System.out.println(result);
        return result;
    }

    public static ArrayList<String> intersecao (ArrayList<String> m, ArrayList<String> n) {
        m = listaM;
        n = listaN;
        String objeto = null;
        ArrayList<String> r = new ArrayList<>();

        for (int i = 0; i < n.size(); i++) {
            if (m.contains(n.get(i))) {
                objeto = m.get(i);
                r.add(objeto);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        amigos.add("Eduardo");
        amigos.add("Raphael");
        amigos.add("Marcus");
        amigos.add("Patricia");
        amigos.add("Amanda");
        System.out.println(amigos);
        //System.out.println(amigos.size());

        amigos.remove("Marcus");
        System.out.println(amigos);

        boolean presente = false;
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.contains("Marcus")) {
                presente = true;
            }
        }
        //System.out.println(presente);
        //System.out.println(amigos.size());
        //somaLista();

        populaLista();
        listaBooleanos(numeros1, numeros2);
        //System.out.println(listaN);
        System.out.println("Intersecao: "+intersecao(listaM,listaN));

        listaUniao uniao = new listaUniao();
        System.out.println("Uniao: " +uniao.uniao(listaM, listaN));

        System.out.println("Numeros: "+numeros);
        Posicao p = new Posicao();
        System.out.println("Posicao: "+p.trocaValor(numeros));
        System.out.println("Numeros: "+numeros);

        Impares i = new Impares();
        System.out.println("Impares: "+i.separarParesImpares(numeros));

        Binario b = new Binario();
        System.out.println("Binario: "+b.converte(6));

        Collections.sort(amigos);
        System.out.println("Lista amigos após a ordenação:");
        for(String lista: amigos){
            System.out.println(lista);
        }

//        Collections.sort(funcionario);
//        for(Funcionario numInscricao: funcionario){
//            System.out.println(numInscricao);
//        }

        System.out.println("Ordenado por Nome: ");
        Collections.sort(funcionario, Funcionario.OrdenaNome);
        for(Funcionario fun: funcionario){
            System.out.println(funcionario);
        }

        System.out.println("Ordenado por Inscricao: ");
        Collections.sort(funcionario, Funcionario.OrdenaInscricao);
        for(Funcionario fun2: funcionario){
            System.out.println(funcionario);
        }
    }
}







