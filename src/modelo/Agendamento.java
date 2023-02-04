package modelo;

public class Agendamento {//Superclasse de Consulta e Procedimento
   
    private String horario;
    private String tutor;
    private String data; 
    private int vet;
    private int pet;//
    private double valor;

    public Agendamento(){
        
    }

    public Agendamento(String horario, String tutor, String data, int vet, int pet, double valor) {
        this.horario = horario;
        this.tutor = tutor;
        this.data = data;
        this.vet = vet;
        this.pet = pet;
        this.valor = valor;
    }

    public String getHorario() {
        return horario;
    }

    public String getData() {
        return data;
    }
    
    public double getValor() {
        return valor;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getVet() {
        return vet;
    }

    public void setVet(int vet) {
        this.vet = vet;
    }

    public int getPet() {
        return pet;
    }

    public void setPet(int pet) {
        this.pet = pet;
    }
    
}
