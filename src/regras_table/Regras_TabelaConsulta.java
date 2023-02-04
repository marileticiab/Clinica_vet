package regras_table;

import controller.Controller_Tabela;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Consulta;
import modelo.Pet;

public class Regras_TabelaConsulta extends AbstractTableModel{
    
    private Vector<Consulta> consultas;
    private controller.Controller_Tabela control;
    private String cabecalho[] = {"Código", "Horário", "Data", "Valor", "PET", "Tutor", "Veterinário"};
    private Pet p;
    
     public Regras_TabelaConsulta(Pet pet){
        this.control = new Controller_Tabela();
        this.p = pet;
        //this.consultas = p.getConsultasPet();//vetor de consultas do pet
        carregaConsuta();
    }
     
    private void carregaConsuta(){
        //acessando todos os clientes
        this.consultas = Controller_Tabela.buscaMinhaConsulta(p.getCodPet());
    }
     //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        return this.consultas.size();
    }
    
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        return 7;
    }
    
    //qual o valor de CADA célula da tabela
    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        
        Consulta c = this.consultas.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: return c.getCodconsulta();
            case 1: return c.getHorario();
            case 2: return c.getData();
            case 3: return c.getValor();
            case 4: return c.getPet();
            case 5: return c.getTutor();
            case 6: return c.getVet();
                
            default: return null;
        }
    }
    
    //nome de cada coluna da tabela (Cabeçalho)
    @Override
    public String getColumnName(int indiceColuna) {
        return cabecalho[indiceColuna];
    }
    
    
    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch(indiceColuna){
            case 0: return Integer.class;
            case 3: return Double.class;
            case 5: return Integer.class;
            case 6: return Integer.class;
            default: return String.class;
        }
    }
}

