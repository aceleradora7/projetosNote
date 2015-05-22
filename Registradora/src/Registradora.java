/**
 * Created by rafael on 5/19/15.
 */
public class Registradora {
    private double troco;
    private double valorTotal;
    private double[] itens;
    //private double valorItem;

    public Registradora(){
        troco = 0;
        valorTotal = 0;
    }

    public void addItem(double valorItem){
        itens = new double[2];
        for(int i=0;i<itens.length;i++){
            itens[i] = valorItem;
        }

    }

    public void exibeLista(){
        for(int i=0;i<itens.length;i++){
            System.out.println("Item: "+ i + " |Valor: " + itens[i]);
            }
    }
}
