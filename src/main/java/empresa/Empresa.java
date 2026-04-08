package empresa;

import javax.swing.JOptionPane;

public class Empresa {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;

    public Empresa() {
        this("", "", "", "", "", "");
    }

    public Empresa(String nome, String endereço, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
        setEndereco(JOptionPane.showInputDialog(null, "Digite seu endereço"));
        setCidade(JOptionPane.showInputDialog(null, "Digite sua cidade"));
        setEstado(JOptionPane.showInputDialog(null, "Digite seu estado"));
        setCep(JOptionPane.showInputDialog(null, "Digite seu CEP"));
        setTelefone(JOptionPane.showInputDialog(null, "Digite seu telefone"));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome:" + getNome() +
         "\nEndereço:" + getEndereco() +
        "\nCidade:" + getCidade() +
        "\nEstado:" + getEstado() +
        "\nCep:" + getCep() +
         "\nTelefone:" + getTelefone() );

    }

    public String paraString() {
        return ("Nome: " + getNome() + "\n Endereço: " + getEndereco() + "\n Cidade: " + getCidade() + "\n Estado: " + getEstado() + "\n CEP: " + getCep() + "\n Telefone: " + getTelefone());
    }
}
