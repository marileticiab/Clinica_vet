package modelo;

import java.util.Vector;

public class Cliente {
   
    private String nomeCliente;
    private String cpfCliente;
    private String senhaC;
    private String email;
    private String telefoneCliente;
    private String rua;
    private int numero;//
    private String bairro;
    private String cidade;
    private Vector<Pet> animaisCliente = new Vector<>();

    //para cadastro 
    public Cliente(String nomeCliente, String cpfCliente, String senhaC, String email, 
            String telefoneCliente, String rua, int numero, String bairro, String cidade) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.senhaC = senhaC;
        this.email = email;
        this.telefoneCliente = telefoneCliente;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Cliente() {
      
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Vector<Pet> getAnimaisCliente() {
        return animaisCliente;
    }

    public String getSenhaC() {
        return senhaC;
    }

    public void setSenhaC(String senhaC) {
        this.senhaC = senhaC;
    }

    public void setAnimaisCliente(Vector<Pet> animaisCliente) {
        this.animaisCliente = animaisCliente;
    }

}
