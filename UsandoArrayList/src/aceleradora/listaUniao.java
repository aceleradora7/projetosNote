package aceleradora;

import java.util.ArrayList;

/**
 * Created by rafael on 5/26/15.
 */
public class listaUniao {

    public listaUniao(){
    }

    public ArrayList<String> uniao (ArrayList<String> m, ArrayList<String> n) {
        ArrayList<String> r = new ArrayList<>();
        for (int i = 0; i < m.size(); i++) {
            if(!r.contains(m.get(i))){
                r.add(m.get(i));
            }
            }
        for (int i = 0; i < n.size(); i++) {
            if(!r.contains(n.get(i))){
                r.add(n.get(i));
            }
        }
        return r;
    }
}
