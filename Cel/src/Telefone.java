/**
 * Created by aluno06 on 21/05/15.
 */
public class Telefone {
    private String numero;
    private String modelo;

    public Telefone(String numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public String getModelo() {
        return modelo;
    }
}
