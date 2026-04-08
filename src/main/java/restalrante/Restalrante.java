package restalrante;

import empresa.Empresa;
import javax.swing.JOptionPane;

public class Restalrante extends Empresa {

    private String tipocomida;
    private float precomedio;

    public Restalrante() {
        this("", (float) 0.0, "", "", "", "", "", "");
    }

    public Restalrante(String tipocomida, float precomedio, String nome, String endereço, String cidade, String estado, String cep, String telefone) {
        super(nome, endereço, cidade, estado, cep, telefone);
        this.tipocomida = tipocomida;
        this.precomedio = precomedio;
    }

    public String getTipocomida() {
        return tipocomida;
    }

    public float getPrecomedio() {
        return precomedio;
    }

    public void setTipocomida(String tipocomida) {
        this.tipocomida = tipocomida;
    }

    public void setPrecomedio(float precomedio) {
        this.precomedio = precomedio;
    }

    @Override
    public void leitura() {
        super.leitura();
        setTipocomida(JOptionPane.showInputDialog(null, "Escreva o tipo de comida:"));
        setPrecomedio(Float.parseFloat(JOptionPane.showInputDialog(null, "Escreva o preço médio:")));
    }

    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "\nTipo de comida: " + getTipocomida() +
        "\nPreço médio:" + getPrecomedio());
    }
    @Override
    public String paraString(){
        return (super.paraString() + "\n Tipo de comida: " + getTipocomida() + "\n Preço médio: " + getPrecomedio() );
    }
}
