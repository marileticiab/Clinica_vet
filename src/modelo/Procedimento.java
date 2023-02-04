package modelo;

public class Procedimento extends Agendamento{
    
    protected int codProc;
    protected String tipo;
    protected String descrição;

    //para cadastro
    public Procedimento(int codProc, String tipo, String descrição, String horario, String tutor, 
            String data, int vet, int pet, double valor) {
        
        super(horario, tutor, data, vet, pet, valor);
        this.codProc = codProc;
        this.tipo = tipo;
        this.descrição = descrição;
    }

    public Procedimento() {
        
    }
    
    public int getCodProc() {
        return codProc;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescrição() {
        return descrição;
    }
    
    public void setCodProc(int codProc) {
        this.codProc = codProc;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
