package trabalhoia;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Mapa extends JFrame implements ActionListener {

    private static JPanel painelFundo;
    private static JTable tabela;
    private static JButton Iniciar;
    private static DefaultTableModel modelo = new DefaultTableModel();
    private static ArrayList<Componente> lista;
    public static Componente drone1;// = new Componente("drone1", 0, 0, false);
    private static Componente centro;// = new Componente("centro", 9, 9, false);
    private static Componente casa1;// = new Componente("casa1", 5, 9, false);
    private static Componente casa2;// = new Componente("casa2", 3, 4, false);
    private static Componente casa3;// = new Componente("casa3", 7, 8, false);
    //public static Object[] componentes = {drone1, centro, casa1, casa2, casa3};

    public Mapa(){
        lista = new ArrayList<Componente>();
    };

    public void criaJanela() {

        drone1 = new Componente("drone1", 0, 0, false);
        centro = new Componente("centro", 5, 5, false);
        casa1 = new Componente("casa1", 5, 9, false);
        casa2 = new Componente("casa2", 3, 4, false);
        casa3 = new Componente("casa3", 7, 8, false);

        lista.add(drone1);
        lista.add(centro);
        lista.add(casa1);
        lista.add(casa2);
        lista.add(casa3);

        painelFundo = new JPanel();
        painelFundo.setLayout(new BoxLayout(painelFundo, BoxLayout.PAGE_AXIS));
        tabela = new JTable(modelo);
        modelo.addColumn(" ");
        modelo.addColumn(" ");
        modelo.addColumn(" ");
        modelo.addColumn(" ");
        modelo.addColumn(" ");
        modelo.addColumn(" ");
        modelo.addColumn(" ");
        modelo.addColumn(" ");
        modelo.addColumn(" ");
        modelo.addColumn(" ");

        tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(8).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(9).setPreferredWidth(10);

        modelo.setNumRows(10);
        tabela.setRowHeight(50);

        modelo.setValueAt(lista.get(0).getNome(), lista.get(0).getPosX(), lista.get(0).getPosY());
        modelo.setValueAt(lista.get(1).getNome(), lista.get(1).getPosX(), lista.get(1).getPosY());
        modelo.setValueAt(lista.get(2).getNome(), lista.get(2).getPosX(), lista.get(2).getPosY());
        modelo.setValueAt(lista.get(3).getNome(), lista.get(3).getPosX(), lista.get(3).getPosY());
        modelo.setValueAt(lista.get(4).getNome(), lista.get(4).getPosX(), lista.get(4).getPosY());

        getContentPane().add(tabela, BorderLayout.CENTER);

        Iniciar = new JButton();
        Iniciar.setText("Iniciar");
        Iniciar.setSize(1,3);
        getContentPane().add(Iniciar, BorderLayout.PAGE_END);
        Iniciar.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

    }

        public static void movimentaDrone(Componente c, int x, int y){
            System.out.println(c.getNome());
            int posicao = 0; //Ver isso

            System.out.println(posicao);
            int xAnt = lista.get(posicao).getPosX();
            int yAnt = lista.get(posicao).getPosY();
            //lista.set(posicao, lista.set(posicao).setPosX(x));
            //lista.get(posicao).setPosY(y);
            Object[] vazio = {" "};

            modelo.setValueAt(c.getNome(),x,y);
            //modelo.setValueAt(drone1.dadosComponente(),x,y);
//            modelo.setValueAt(o[0].toString(), c.getPosX(), c.getPosY());
            modelo.setValueAt(vazio[0],xAnt,yAnt);    }

    public static void main(String[] args) {
        Mapa m = new Mapa();
        m.criaJanela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        movimentaDrone(drone1, 5, 5);
        drone1.isCarregado(true);
        System.out.println(drone1.isCarregado());
        movimentaDrone(drone1, 5, 9);
        drone1.isCarregado(false);
        System.out.println(drone1.isCarregado());


    }
}
