
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = null;
        String dataNascimento = null;
        String rg = null;
        int idade = 0;
        String email = null;
        String fim = "s";
        Contato codigo;
        listaContatos lc = new listaContatos();

        while (fim.equals("s")){

            System.out.println("Insira o nome do contato: ");
            nome = sc.next();

            System.out.println("Insira a data de nascimento: ");
            dataNascimento = sc.next();

            System.out.println("Insira o rg: ");
            rg = sc.next();

            System.out.println("Insira a idade: ");
            idade = sc.nextInt();

            System.out.println("Insira o email: ");
            email = sc.next();

            System.out.println("Insira o codigo do contato: ");
            email = sc.next();

            codigo = new Contato(nome, dataNascimento, rg, idade, email);

            lc.addContato(codigo);
            Collections.sort(lc);
            lc.imprime();

            System.out.println("Deseja cadastrar um novo contato Mané: ");
            fim = sc.next();
            if(fim.equals("n"))
                System.exit(0);
        }
    }
}
