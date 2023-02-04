package modelo;

public class Veterinario{
   
    private int crmv;
    private String formacao;
    private String senhaVet;
    private String nomeVet;
    private String telefoneVet;
    private String email;

    //para cadastro
    public Veterinario(int crmv, String formacao, String senhaVet, String nomeVet, String telefoneVet, String email) {
        this.crmv = crmv;
        this.formacao = formacao;
        this.senhaVet = senhaVet;
        this.nomeVet = nomeVet;
        this.telefoneVet = telefoneVet;
        this.email = email;
    }

    public Veterinario() {
      
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeVet() {
        return nomeVet;
    }
   
    public int getCrmv() {
        return crmv;
    }

    public void setCrmv(int crmv) {
        this.crmv = crmv;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getSenhaVet() {
        return senhaVet;
    }

    public void setSenhaVet(String senhaVet) {
        this.senhaVet = senhaVet;
    }

    public String getTelefoneVet() {
        return telefoneVet;
    }

    public void setTelefoneVet(String telefoneVet) {
        this.telefoneVet = telefoneVet;
    } 

    public void setNomeVet(String nomeVet) {
        this.nomeVet = nomeVet;
    }
    
}
