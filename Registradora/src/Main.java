import java.util.Scanner;

/**
 * Created by rafael on 5/20/15.
 */
public class Main {
    public static void main(String[] args){
        Registradora reg1 = new Registradora();
        Scanner sc = new Scanner(System.in);
        double[] itens = new double[2];
        for (int i = 0; i < itens.length; i++) {
            System.out.println("Entre com o valor: "+sc.nextDouble());
            itens[i] = sc.nextDouble();
            reg1.addItem(itens[i]);
        }

        reg1.exibeLista();
    }
}
