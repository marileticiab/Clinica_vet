package modelo;

public class Receita {
    
    private String nomeIC;
    private String descriçãoIC;
    private int pet;
    private int vet;
    private String tutor;
    private int codReceita;

    //para cadastro
    public Receita(String nomeIC, String descriçãoIC, int pet, int vet, String tutor, int codReceita) {
        this.nomeIC = nomeIC;
        this.descriçãoIC = descriçãoIC;
        this.pet = pet;
        this.vet = vet;
        this.tutor = tutor;
        this.codReceita = codReceita;
    }

    public Receita() {
        
    }

    public String getNomeIC() {
        return nomeIC;
    }

    public void setNomeIC(String nomeIC) {
        this.nomeIC = nomeIC;
    }

    public String getDescriçãoIC() {
        return descriçãoIC;
    }

    public void setDescriçãoIC(String descriçãoIC) {
        this.descriçãoIC = descriçãoIC;
    }

    public int getPet() {
        return pet;
    }

    public void setPet(int pet) {
        this.pet = pet;
    }

    public int getVet() {
        return vet;
    }

    public void setVet(int vet) {
        this.vet = vet;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getCodReceita() {
        return codReceita;
    }

    public void setCodReceita(int codReceita) {
        this.codReceita = codReceita;
    }

    
}
