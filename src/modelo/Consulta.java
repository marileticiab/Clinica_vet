package modelo;

public class Consulta extends Agendamento{
    
    protected int codconsulta;

    //para cadastro
    public Consulta(int codconsulta, String horario, String tutor, String data, int vet, int pet, double valor) {
        super(horario, tutor, data, vet, pet, valor);
        this.codconsulta = codconsulta;
    }

    public Consulta() {
      
    }
    
    public int getCodconsulta() {
        return codconsulta;
    }
    
    public void setCodconsulta(int codconsulta) {
        this.codconsulta = codconsulta;
    }

}
