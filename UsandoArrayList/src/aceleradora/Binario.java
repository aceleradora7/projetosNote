package aceleradora;

import java.util.ArrayList;

/**
 * Created by rafael on 5/26/15.
 */
public class Binario {

    public Binario(){
    }

    public ArrayList<Integer> converte(int valor){
        ArrayList<Integer> result = new ArrayList<>();
        int bin = 0;
        while(valor != 0){
            if(valor % 2==0) {
                valor = valor/2;
                bin = 0;
                result.add(0,bin);
            }
            else {
                valor = valor/2;
                bin = 1;
                result.add(0,bin);
            }
        }
        return result;
    }
}
