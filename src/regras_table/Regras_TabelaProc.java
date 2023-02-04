package regras_table;

import controller.Controller_Tabela;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import modelo.Pet;
import modelo.Procedimento;

public class Regras_TabelaProc extends AbstractTableModel{
    
    private Vector<Procedimento> procedimentos;
    private String cabecalho[] = {"Código", "Horário", "Data", "Valor", "Tipo", "Decrição", "PET", "Tutor", "Veterinário"};
    private Pet p;
        
     public Regras_TabelaProc(Pet pet){
        this.p = pet;
        //this.procedimentos = p.getProcedimentosPet();//vetor de proc. do pet
        carregaProc();
    }
     
     
    private void carregaProc(){
        //acessando todos os clientes
        this.procedimentos = Controller_Tabela.buscaMeuProc(p.getCodPet());
    }
     //quantidade de linhas desenhadas na tabela
    @Override
    public int getRowCount() {
        return this.procedimentos.size();
    }
    
    //quantidade de colunas desenhadas na tabela
    @Override
    public int getColumnCount() {
        return 9;
    }
    
    //qual o valor de CADA célula da tabela
    @Override
    public Object getValueAt(int indiceLinha, int indiceColuna) {
        
        Procedimento p = this.procedimentos.get(indiceLinha);
        
        switch(indiceColuna){
            case 0: return p.getCodProc();
            case 1: return p.getHorario();
            case 2: return p.getData();
            case 3: return p.getValor();
            case 4: return p.getTipo();
            case 5: return p.getDescrição();
            case 6: return p.getPet();
            case 7: return p.getTutor();
            case 8: return p.getVet();
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
            case 6: return Integer.class;
            case 7: return Integer.class;
            default: return String.class;
        }
    }
}

